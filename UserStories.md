# Partie 1 : Implémentation des fonctions de base de codage et de décodage

Concevoir et réaliser des outils de codage décodage par mono-substitution des caractères. Les outils développés doivent permettre de coder n'importe quelle suite de caractères à l'aide d'une clé avec évidemment le traitement réciproque : décoder une suite codée en connaissant la clé. La programmation et les tests s'effectueront à l'aide du langage source Java. Un exemple de mise en œuvre sera le codage de fichiers textes (et évidemment le décodage des fichiers codés).

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
    -   La clé de substitution est une bijection
    -   La clé ne contient pas de caractères en double
    -   L'application renvoie une erreur si la clé est invalide

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
