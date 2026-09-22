# GolfSwingAnalyzer

Application Android d'analyse de swing de golf par ralenti caméra.

## Fonctionnalités
- Détection automatique des capacités slow-motion du téléphone (Camera2 HFR : 120/240 fps selon le device)
- Deux modes de capture : vue de derrière (trajectoire de balle) et vue de face (angle du club)
- Détection de phase de swing (Address -> Backswing -> Top -> Downswing -> Impact -> Follow-through -> Finish)
- Ralenti automatiquement centré sur l'impact
- Tracé de trajectoire de balle en overlay rouge (vue de derrière)
- Analyse d'angle de club/shaft (vue de face)
- 100% Kotlin, sans dépendance native (pas d'OpenCV) : détection de balle et de shaft implémentées en Kotlin pur

## Stack technique
- Kotlin, Jetpack Compose, CameraX + Camera2 (HFR), MediaPipe Pose Landmarker, Room, Hilt, Coroutines/Flow

## Installation
1. Cloner le dépôt
2. Ouvrir dans Android Studio (Iguana ou plus récent) -> le wrapper Gradle sera régénéré automatiquement si besoin
3. Télécharger le modèle MediaPipe `pose_landmarker_lite.task` depuis https://storage.googleapis.com/mediapipe-models/pose_landmarker/pose_landmarker_lite/float16/latest/pose_landmarker_lite.task et le placer dans `app/src/main/assets/`
4. Générer une icône d'application via *Image Asset Studio* (clic droit sur `res` > New > Image Asset) si les icônes ne sont pas présentes
5. Compiler et lancer sur un appareil physique (la capture caméra ne fonctionne pas en émulateur)

## Structure
Voir le code source dans `app/src/main/java/com/golfswing/analyzer/` organisé en Clean Architecture (ui / domain-analysis / data / di).
