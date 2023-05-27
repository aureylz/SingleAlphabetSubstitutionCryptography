# Cryptographie par simple substitution mono-alphabétique

## Contexte
La cryptographie est l'art du chiffrement des documents afin de les rendre indéchiffrables par un concurrent ou un ennemi. Ce domaine, essentiel en stratégie militaire, a connu un essor considérable avec l'apparition des ordinateurs. La cryptanalyse est l'art du déchiffrement auquel se livrent les espions...

La méthode que nous nous proposons de mettre en œuvre est une des plus simples mais aussi, bien sûr, une des plus faciles à déchiffrer. Il s'agit d'effectuer une substitution d'un caractère d'un code par un autre caractère. Une telle substitution est appelée simple substitution mono-alphabétique : elle nécessite une **clé** qui donne les correspondances entre les caractères d'origine et leur équivalent codé.

**Exemple :**
⇨ On décide de remplacer :
- A par X
- B par S
- C par H
- D par A
- E par P
- F par M
- G par Z
- H par R
- 1 par D
- etc...

⇒ Le mot BAIE devient alors SXDP

Si l'on possède la clé le processus de déchiffrage est évident.

Une clé de codage est alors une bijection sur un sous-ensemble de caractères.  
Tout caractère qui n'est pas défini dans la clé sera retranscrit tel qu'il est, c'est-à-dire qu'il ne sera pas codé

Ainsi supposons que nous avons la clé suivante :
a ⇔ d  
d ⇔ espace  
i ⇔ t  
t ⇔ z  
v ⇔ a  
z ⇔ i  
espace ⇔ v  

Alors la chaine «vive java !» devient, une fois codée à l'aide de cette clé, «ataevjdadv!».  
Le décodage fonctionne alors de manière réciproque : «ataevjdadv!» devient «vive java !» (les caractères `e`, `j`, `!` n'ayant pas de codage, ont été recopiés tels quels).

**Remarque :**
Les romains avaient un moyen simple de créer une clé bijective: ils opéraient par décalage de l'alphabet d'un certain pas (`a` devient `d`, `b` devient `e`, `c` devient `f`, ... , `w` devient `z`, puis par rotation `x` devient `a`, `y` devient `b`, `z` devient `c`). Ce procédé connu sous le nom de « code de César » est très facile à décoder du fait qu'il suffit d'essayer tous les décalages de 1 à longueur clé-1 pour trouver lequel donne un texte composé de mots d'une langue connue.  
Heureusement que leurs adversaires n'avaient pas de calculateurs électroniques sinon tout message codé aurait été lu en clair en moins d'une minute!

Les espions ou adversaires sont évidemment intéressés par le déchiffrement: décoder un message codé sans connaître a priori la clé du codage. Entrons dans le domaine de la cryptanalyse....

Le codage par simple substitution de chaque caractère par un autre de façon bijective et stable au cours du codage (pas de changement de clé en fonction de la position) possède beaucoup de failles car il laisse stables certaines caractéristiques du texte. Ainsi la statistique de distribution des fréquences d'apparition des caractères sera identique: la statistique de fréquence d'un caractère dans le texte codé est la même que celle du caractère correspondant dans le texte original.

Supposons qu'après analyse de nombreux textes concernant le domaine d'espionnage (exemples : des textes concernant la logistique militaire lors d'une opération terrestre) exprimés dans une langue donnée, on établisse, avec cet échantillon représentatif, la fréquence des différents caractères utilisés. On possède alors pour cette langue une table des fréquences ordonnable de façon décroissante :

| Caractère | Fréquence |
|-----------|-----------|
| ' '       | 16,454%   |
| 'e'       | 11,806%   |
| 't'       | 9,006%    |
| 'a'       | 7,841%    |
| 's'       | 6,264%    |
| 'i'       | 6,243%    |
| 'o'       | 6,231%    |
| 'n'       | 6,217%    |
| 'r'       | 5,987%    |
| ...       | ...       |

Muni de cette base de connaissance pour différentes langues, il suffit alors d'essayer des clés bijectives qui font correspondre les caractères du texte chiffré avec ceux de la table d'une langue en corrélant les caractères de fréquence proche. Chaque essai sera très rapide avec les moyens numériques actuels.

A la suite de plusieurs essais avec différentes hypothèses de clés correspondant à quelques possibilités dans différentes langues, on obtient une collection de textes déchiffrés exprimés dans ces langues. Il est alors fort probable que certains textes soient suffisamment expressifs pour y reconnaître des portions dans une langue donnée (on reconnait des mots fréquents presque complets) et enrichir la connaissance de la clé..... qui va permettre de lire le texte de façon compréhensible.

Cette méthode de chiffrement par simple mono-substitution n'est donc pas du tout pertinente à l'ère de l'électronique !

Mais elle va nous permettre de faire un exercice en Génie Logiciel.

## Travail à faire
Le travail prévu est de développer des outils de cryptographie et de cryptanalyse mono- alphabétique.

 1.  Concevoir et réaliser des outils de codage décodage par mono-substitution des caractères.  
Les outils développés doivent permettre de coder n'importe quelle suite de caractères à l'aide d'une clé avec évidemment le traitement réciproque : décoder une suite codée en connaissant la clé. La programmation et les tests s'effectueront à l'aide du langage source java.  
Un exemple de mise en œuvre sera le codage de fichiers textes (et évidemment le décodage des fichiers codés).

 1. Concevoir et réaliser des outils d'analyse statistique de textes afin d'en déduire des statistiques sur les fréquences des caractères rencontrés.  
Les outils développés doivent permettre d'analyser des fichiers textes, dans une langue donnée et des domaines identifiés, afin d'obtenir les statistiques pour les langues/domaines analysés.  
Un exemple de mise en œuvre sera d'analyser un fichier texte chiffré pour en déduire la statistique de fréquence des caractères utilisés.

 1. Concevoir et réaliser des outils de déchiffrement d'un texte codé dont on ne connait pas la clé. En plus du texte codé, on dispose des statistiques des fréquences issues d'analyses de textes concernant le domaine et les langues supposés pouvoir correspondre au texte à déchiffrer.
En calculant les statistiques des fréquences sur le texte codé et en les mettant en correspondances avec des statistiques de fréquences d'autres textes (non codés) supposés écrits dans les mêmes langue/domaine, il est possible de formuler des hypothèses de clés. Chaque hypothèse de clé peut alors être utilisée pour décoder le texte codé afin de pouvoir reconnaître des mots. Lorsqu'une hypothèse de clé permet d'identifier des mots, il faut tenter de la « réajuster » jusqu'à obtenir une clé qui induit un texte décodé compréhensible.

L'objectif pédagogique de cet exercice est de mettre en œuvre un cycle itératif de développement avec un plan de test cohérent.

Définir une première itération concernant les outils à mettre en place :

 - En cerner la spécification en utilisant les formalismes avec lesquels vous êtes familiers :
	 - « user stories »
	 - « scénarios de cas d'utilisation »
	 - ...

**Comment tester ces spécifications ?**

- Modéliser une solution Orientée Objet permettant d'avoir une architecture « métier » de base pour réaliser les fonctionnalités spécifiées.

**Comment tester cette conception ?**

- Réaliser en java la solution choisie.

**Comment tester cette solution ?**
**Comment planifier les tâches au cours de l'itération ?**

⇨ Proposer un plan de test pour cette itération.

(Nous envisagerons ensuite la prochaine itération si nous en avons le temps...)
