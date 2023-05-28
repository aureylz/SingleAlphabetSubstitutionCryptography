| Identifiant | Titre                                                                         |
|-------------|-------------------------------------------------------------------------------|
| INIT-00     | Initialisation de l'environnement de développement et de la structure de code |
| CODE-00     | Validation de la clé de substitution pour le codage                           |
| CODE-01     | Codage du texte avec la clé validée                                           |
| DECODE-00   | Validation de la clé de substitution pour le décodage                         |
| DECODE-01   | Décodage du texte avec la clé validée                                         |
| F_CODE-00   | Sélection du fichier à coder                                                  |
| F_CODE-01   | Codage du fichier avec la clé validée                                         |
| F_DECODE-00 | Sélection du fichier à décoder                                                |
| F_DECODE-01 | Décodage du fichier avec la clé validée                                       |
| STAT-00     | Sélection du fichier à analyser                                               |
| STAT-01     | Analyse du fichier pour obtenir les statistiques de fréquence                 |
| DEC_INIT-00 | Initialisation du module de déchiffrement                                     |
| DEC-00      | Calcul des statistiques de fréquence du texte codé                            |
| DEC-01      | Mise en correspondance des statistiques de fréquence                          |
| DEC-02      | Formulation d'hypothèses de clés                                              |
| DEC-03      | Décodage du texte avec des hypothèses de clés                                 |
| DEC-04      | Réajustement des hypothèses de clés                                           |

# Partie 1 : Implémentation des fonctions de base de codage et de décodage

Concevoir et réaliser des outils de codage décodage par mono-substitution des caractères.  
Les outils développés doivent permettre de coder n'importe quelle suite de caractères à l'aide d'une clé avec évidemment le traitement réciproque : décoder une suite codée en connaissant la clé. La programmation et les tests s'effectueront à l'aide du langage source java.  
Un exemple de mise en œuvre sera le codage de fichiers textes (et évidemment le décodage des fichiers codés).

## Epic 0 : Initialisation du projet

### [INIT-00] : Initialisation de l'environnement de développement et de la structure de code

- **Story :** En tant que développeur, je veux mettre en place l'environnement de développement et créer la structure de base du code pour commencer le développement des fonctionnalités de codage et de décodage.
- **DOR :** Les outils de développement (IDE, Java SDK, etc.) sont installés et prêts à l'emploi.
- **DOD :** L'environnement de développement est opérationnel et la structure de code de base (avec les packages de base et les classes principales) est créée.
- **Critères d'acceptance :**
  - L'environnement de développement est fonctionnel et prêt pour le développement
  - La structure de code de base est mise en place avec les packages nécessaires
  - Les classes principales pour le codage et le décodage sont créées, même si elles sont initialement vides ou contiennent seulement des méthodes squelettes.

## Epic 1 : Codage d'un texte

### [CODE-00] Validation de la clé de substitution

- **Story :** En tant qu'utilisateur, je veux être en mesure de vérifier que la clé de substitution est valide et qu'elle peut être utilisée pour coder un texte.
- **DOR :** La clé de substitution est disponible.
- **DOD :** La clé est vérifiée et prête à être utilisée pour le codage.
- **Critères d'acceptance :**
  - La clé de substitution est une bijection
  - La clé ne contient pas de caractères en double
  - L'application renvoie une erreur si la clé est invalide

### [CODE-01] Codage du texte avec la clé validée

- **Story :** En tant qu'utilisateur, après avoir validé la clé, je veux coder un texte avec cette clé.
- **DOR :** La clé de substitution est valide et le texte à coder est prêt.
- **DOD :** Le texte est codé correctement avec la clé de substitution.
- **Critères d'acceptance :**
  - Le texte codé est différent du texte d'origine
  - Un texte identique codé avec la même clé produira le même texte codé
  - Un texte vide reste vide après codage

## Epic 2 : Décodage d'un texte

### [DECODE-00] Validation de la clé de substitution pour le décodage

- **Story :** En tant qu'utilisateur, je veux être en mesure de vérifier que la clé de substitution est valide et qu'elle peut être utilisée pour décoder un texte.
- **DOR :** La clé de substitution est disponible.
- **DOD :** La clé est vérifiée et prête à être utilisée pour le décodage.
- **Critères d'acceptance :**
  - La clé de substitution est une bijection
  - La clé ne contient pas de caractères en double
  - L'application renvoie une erreur si la clé est invalide

### [DECODE-01] Décodage du texte avec la clé validée

- **Story :** En tant qu'utilisateur, après avoir validé la clé, je veux décoder un texte avec cette clé.
- **DOR :** La clé de substitution est valide et le texte à décoder est prêt.
- **DOD :** Le texte est décodé correctement avec la clé de substitution.
- **Critères d'acceptance :**
  - Le texte décodé est identique au texte d'origine
  - Un texte identique décodé avec la même clé produira le même texte décodé
  - Un texte vide reste vide après décodage

## Epic 3 : Codage d'un fichier texte

### [F_CODE-00] Sélection du fichier à coder

- **Story :** En tant qu'utilisateur, je veux être en mesure de sélectionner le fichier que je souhaite coder.
- **DOR :** Le fichier est disponible et accessible.
- **DOD :** Le fichier est sélectionné et prêt à être codé.
- **Critères d'acceptance :**
  - L'utilisateur peut naviguer et sélectionner un fichier
  - L'application renvoie une erreur si le fichier n'est pas disponible ou accessible

### [F_CODE-01] Codage du fichier avec la clé validée

- **Story :** En tant qu'utilisateur, après avoir validé la clé et sélectionné le fichier, je veux coder ce fichier avec cette clé.
- **DOR :** La clé de substitution est valide et le fichier est prêt à être codé.
- **DOD :** Le fichier est codé correctement avec la clé de substitution.
- **Critères d'acceptance :**
  - Le fichier codé est différent du fichier d'origine
  - Un fichier identique codé avec la même clé produira le même fichier codé
  - Un fichier vide reste vide après codage

## Epic 4 : Décodage d'un fichier texte

### [F_DECODE-00] Sélection du fichier à décoder

- **Story :** En tant qu'utilisateur, je veux être en mesure de sélectionner le fichier que je souhaite décoder.
- **DOR :** Le fichier est disponible et accessible.
- **DOD :** Le fichier est sélectionné et prêt à être décodé.
- **Critères d'acceptance :**
  - L'utilisateur peut naviguer et sélectionner un fichier
  - L'application renvoie une erreur si le fichier n'est pas disponible ou accessible

### [F_DECODE-01] Décodage du fichier avec la clé validée

- **Story :** En tant qu'utilisateur, après avoir validé la clé et sélectionné le fichier, je veux décoder ce fichier avec cette clé.
- **DOR :** La clé de substitution est valide et le fichier est prêt à être décodé.
- **DOD :** Le fichier est décodé correctement avec la clé de substitution.
- **Critères d'acceptance :**
  - Le fichier décodé est identique au fichier d'origine
  - Un fichier identique décodé avec la même clé produira le même fichier décodé
  - Un fichier vide reste vide après décodage

## Epic 5 : Gestion des erreurs et robustesse

### [ERROR-00] Gestion des erreurs de clé

- **Story :** En tant qu'utilisateur, si je fournis une clé invalide, je veux recevoir un message d'erreur clair qui m'explique pourquoi la clé est invalide.
- **DOR :** Une clé invalide est fournie.
- **DOD :** Un message d'erreur approprié est renvoyé.
- **Critères d'acceptance :**
  - Si la clé de substitution n'est pas une bijection, un message d'erreur est renvoyé expliquant que toutes les valeurs doivent être uniques
  - Si la clé contient des caractères en double, un message d'erreur est renvoyé expliquant que chaque caractère ne peut apparaître qu'une seule fois dans la clé

### [ERROR-01] Gestion des erreurs de fichier

- **Story :** En tant qu'utilisateur, si je tente de coder ou de décoder un fichier qui n'est pas accessible ou qui n'existe pas, je veux recevoir un message d'erreur clair qui m'explique le problème.
- **DOR :** Un fichier inaccessible ou inexistant est sélectionné pour le codage ou le décodage.
- **DOD :** Un message d'erreur approprié est renvoyé.
- **Critères d'acceptance :**
  - Si le fichier n'est pas accessible ou n'existe pas, un message d'erreur est renvoyé expliquant le problème

### [ROBUST-00] Gestion des grands fichiers

- **Story :** En tant qu'utilisateur, je veux être capable de coder et de décoder des fichiers de grande taille sans que l'application ne plante ou ne ralentisse de manière significative.
- **DOR :** Un grand fichier est prêt à être codé ou décodé.
- **DOD :** Le grand fichier est codé ou décodé correctement sans problèmes de performance significatifs.
- **Critères d'acceptance :**
  - L'application peut traiter un fichier de grande taille (par exemple, 1 Go) sans crasher
  - L'application traite un fichier de grande taille dans un délai raisonnable (par exemple, moins de 5 minutes pour un fichier de 1 Go)

---

# Partie 2 : Implémentation des outils d'analyse statistique de textes

Concevoir et réaliser des outils d'analyse statistique de textes afin d'en déduire des statistiques sur les fréquences des caractères rencontrés.  
Les outils développés doivent permettre d'analyser des fichiers textes, dans une langue donnée et des domaines identifiés, afin d'obtenir les statistiques pour les langues/domaines analysés.  
Un exemple de mise en œuvre sera d'analyser un fichier texte chiffré pour en déduire la statistique de fréquence des caractères utilisés.

## Epic 6 : Initialisation du projet d'analyse

### [INIT-01] : Initialisation de l'environnement de développement pour le module d'analyse

- **Story :** En tant que développeur, je veux configurer l'environnement de développement et créer la structure de base du code pour commencer le développement des outils d'analyse statistique de texte.
- **DOR :** Les outils de développement pour cette partie sont installés et prêts à l'emploi.
- **DOD :** L'environnement de développement pour l'analyse statistique est opérationnel et la structure de code de base est créée.
- **Critères d'acceptance :**
  - L'environnement de développement est fonctionnel et prêt pour le développement
  - La structure de code de base est mise en place avec les packages nécessaires pour l'analyse statistique
  - Les classes principales pour l'analyse statistique sont créées, même si elles sont initialement vides ou contiennent seulement des méthodes squelettes.

## Epic 7 : Analyse statistique d'un texte

### [STAT-00] : Analyse de fréquence des caractères dans un texte

- **Story :** En tant qu'utilisateur, je veux analyser un texte donné pour obtenir les fréquences de chaque caractère.
- **DOR :** Le texte à analyser est disponible.
- **DOD :** Les statistiques de fréquence de chaque caractère sont disponibles.
- **Critères d'acceptance :**
  - Les fréquences de tous les caractères du texte sont calculées et disponibles
  - Les fréquences sont correctes (la somme de toutes les fréquences est égale à 1)

### [STAT-01] : Présentation des résultats de l'analyse

- **Story :** En tant qu'utilisateur, je veux voir les résultats de l'analyse sous une forme facile à comprendre (graphiques, tableaux, etc.).
- **DOR :** Les résultats de l'analyse statistique sont disponibles.
- **DOD :** Les résultats sont présentés sous une forme claire et facile à comprendre.
- **Critères d'acceptance :**
  - Les résultats sont présentés de manière organisée et lisible
  - Des graphiques et/ou des tableaux sont utilisés pour une meilleure visualisation des résultats

## Epic 8 : Analyse statistique d'un fichier texte

### [F_STAT-00] : Sélection du fichier à analyser

- **Story :** En tant qu'utilisateur, je veux être en mesure de sélectionner le fichier que je souhaite analyser.
- **DOR :** Le fichier est disponible et accessible.
- **DOD :** Le fichier est sélectionné et prêt à être analysé.
- **Critères d'acceptance :**
  - L'utilisateur peut naviguer et sélectionner un fichier
  - L'application renvoie une erreur si le fichier n'est pas disponible ou accessible

### [F_STAT-01] : Analyse de fréquence des caractères dans un fichier

- **Story :** En tant qu'utilisateur, je veux analyser un fichier donné pour obtenir les fréquences de chaque caractère.
- **DOR :** Le fichier à analyser est disponible.
- **DOD :** Les statistiques de fréquence de chaque caractère sont disponibles.
- **Critères d'acceptance :**
  - Les fréquences de tous les caractères du fichier sont calculées et disponibles
  - Les fréquences sont correctes (la somme de toutes les fréquences est égale à 1)

### [F_STAT-02] : Présentation des résultats de l'analyse du fichier

- **Story :** En tant qu'utilisateur, je veux voir les résultats de l'analyse du fichier sous une forme facile à comprendre (graphiques, tableaux, etc.).
- **DOR :** Les résultats de l'analyse statistique sont disponibles.
- **DOD :** Les résultats sont présentés sous une forme claire et facile à comprendre.
- **Critères d'acceptance :**
  - Les résultats sont présentés de manière organisée et lisible
  - Des graphiques et/ou des tableaux sont utilisés pour une meilleure visualisation des résultats

## Epic 9 : Analyse statistique d'un fichier texte chiffré

### [CF_STAT-00] : Sélection du fichier chiffré à analyser

- **Story :** En tant qu'utilisateur, je veux être en mesure de sélectionner le fichier chiffré que je souhaite analyser.
- **DOR :** Le fichier chiffré est disponible et accessible.
- **DOD :** Le fichier chiffré est sélectionné et prêt à être analysé.
- **Critères d'acceptance :**
  - L'utilisateur peut naviguer et sélectionner un fichier chiffré
  - L'application renvoie une erreur si le fichier n'est pas disponible ou accessible

### [CF_STAT-01] : Analyse de fréquence des caractères dans un fichier chiffré

- **Story :** En tant qu'utilisateur, je veux analyser un fichier chiffré donné pour obtenir les fréquences de chaque caractère.
- **DOR :** Le fichier chiffré à analyser est disponible.
- **DOD :** Les statistiques de fréquence de chaque caractère sont disponibles.
- **Critères d'acceptance :**
  - Les fréquences de tous les caractères du fichier chiffré sont calculées et disponibles
  - Les fréquences sont correctes (la somme de toutes les fréquences est égale à 1)

### [CF_STAT-02] : Présentation des résultats de l'analyse du fichier chiffré

- **Story :** En tant qu'utilisateur, je veux voir les résultats de l'analyse du fichier chiffré sous une forme facile à comprendre (graphiques, tableaux, etc.).
- **DOR :** Les résultats de l'analyse statistique sont disponibles.
- **DOD :** Les résultats sont présentés sous une forme claire et facile à comprendre.
- **Critères d'acceptance :**
  - Les résultats sont présentés de manière organisée et lisible
  - Des graphiques et/ou des tableaux sont utilisés pour une meilleure visualisation des résultats

# Partie 3 : Déchiffrement de textes codés

Concevoir et réaliser des outils de déchiffrement d'un texte codé dont on ne connait pas la clé. En plus du texte codé, on dispose des statistiques des fréquences issues d'analyses de textes concernant le domaine et les langues supposés pouvoir correspondre au texte à déchiffrer. En calculant les statistiques des fréquences sur le texte codé et en les mettant en correspondances avec des statistiques de fréquences d'autres textes (non codés) supposés écrits dans les mêmes langue/domaine, il est possible de formuler des hypothèses de clés. Chaque hypothèse de clé peut alors être utilisée pour décoder le texte codé afin de pouvoir reconnaître des mots. Lorsqu'une hypothèse de clé permet d'identifier des mots, il faut tenter de la « réajuster » jusqu'à obtenir une clé qui induit un texte décodé compréhensible.

## Epic 10 : Initialisation du projet de déchiffrement

### [INIT-02] : Initialisation de l'environnement de développement pour le module de déchiffrement

- **Story :** En tant que développeur, je veux configurer l'environnement de développement et créer la structure de base du code pour commencer le développement des outils de déchiffrement de texte.
- **DOR :** Les outils de développement pour cette partie sont installés et prêts à l'emploi.
- **DOD :** L'environnement de développement pour le déchiffrement est opérationnel et la structure de code de base est créée.
- **Critères d'acceptance :**
  - L'environnement de développement est fonctionnel et prêt pour le développement
  - La structure de code de base est mise en place avec les packages nécessaires pour le déchiffrement
  - Les classes principales pour le déchiffrement sont créées, même si elles sont initialement vides ou contiennent seulement des méthodes squelettes.

## Epic 11 : Déchiffrement basé sur les statistiques de fréquence

### [DEC-00] : Calcul des statistiques de fréquence du texte codé

- **Story :** En tant qu'utilisateur, je veux calculer les statistiques de fréquence des caractères dans le texte codé pour préparer le déchiffrement.
- **DOR :** Le texte codé est disponible.
- **DOD :** Les statistiques de fréquence de chaque caractère dans le texte codé sont disponibles.
- **Critères d'acceptance :**
  - Les fréquences de tous les caractères du texte codé sont calculées et disponibles
  - Les fréquences sont correctes (la somme de toutes les fréquences est égale à 1)

### [DEC-01] : Mise en correspondance des statistiques de fréquence

- **Story :** En tant qu'utilisateur, je veux mettre en correspondance les statistiques de fréquence du texte codé avec celles de textes non codés supposés écrits dans les mêmes langue/domaine.
- **DOR :** Les statistiques de fréquence du texte codé et celles des textes non codés sont disponibles.
- **DOD :** Les correspondances entre les fréquences de caractères du texte codé et des textes non codés sont identifiées.
- **Critères d'acceptance :**
  - Les correspondances sont identifiées avec précision
  - Les correspondances sont sauvegardées pour une utilisation ultérieure

### [DEC-02] : Formulation d'hypothèses de clés

- **Story :** En tant qu'utilisateur, je veux formuler des hypothèses de clés basées sur les correspondances de fréquence de caractères.
- **DOR :** Les correspondances de fréquence de caractères sont disponibles.
- **DOD :** Des hypothèses de clés sont formulées.
- **Critères d'acceptance :**
  - Plusieurs hypothèses de clés sont générées à partir des correspondances de fréquences
  - Les hypothèses de clés sont sauvegardées pour une utilisation ultérieure

## Epic 12 : Décodage et réajustement de la clé

### [DEC-03] : Décodage du texte avec des hypothèses de clés

- **Story :** En tant qu'utilisateur, je veux utiliser chaque hypothèse de clé pour décoder le texte codé et identifier des mots.
- **DOR :** Les hypothèses de clés sont disponibles.
- **DOD :** Le texte est décodé en utilisant chaque hypothèse de clé, et des mots sont identifiés.
- **Critères d'acceptance :**
  - Chaque hypothèse de clé est utilisée pour décoder le texte
  - Des mots sont identifiés dans le texte décodé
  - Les mots identifiés sont sauvegardés pour une utilisation ultérieure

### [DEC-04] : Réajustement des hypothèses de clés

- **Story :** En tant qu'utilisateur, je veux réajuster chaque hypothèse de clé jusqu'à obtenir un texte décodé compréhensible.
- **DOR :** Les mots identifiés dans le texte décodé sont disponibles.
- **DOD :** Les hypothèses de clés sont réajustées et un texte décodé compréhensible est obtenu.
- **Critères d'acceptance :**
  - Les hypothèses de clés sont réajustées en fonction des mots identifiés
  - Le texte décodé est compréhensible
  - Le texte décodé et la clé utilisée pour le décodage sont sauvegardés
