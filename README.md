\documentclass[11pt]{report}
\usepackage[T1]{fontenc}
\usepackage[default,osf]{raleway} 
\usepackage{hyperref}
\renewcommand{\familydefault}{\sfdefault}
\usepackage[a4paper,hmargin=2cm,vmargin=1.5cm]{geometry}
\usepackage[english,french]{babel} % Last language, language by default
\usepackage{graphicx,enumitem,lipsum}
\usepackage[colorlinks=true,urlcolor=RoyalBlue4]{hyperref}
\begin{document}
    \includegraphics[width=16cm ,height=23cm]{img/first.png}
\newpage
\tableofcontents
\newpage
\section{Introduction}
Dans le cadre de notre projet de dévéloppement WEB/JEE, nous avons essayé de faire une application Web en appliquant les architectures aisni que les frameworks les plus utilisées en JEE qu'on a vu.\newline
Ce projet à pour objectif est la maîtrise de ces technologies\newline
Notre projet consiste à créer une application Web qui aide les utilisateurs à trouver un technicien qui répare une panne de maison, et qui aide égalment les techniciens à trouver des clients.\newline
Nous avons appliqué le concept MVC(Model-View-Controller) avec les technologies suivantes:\newline
View: nous avons créé la vue avec les balises HTML et nous avons décoré avec CSS\newline
Control: nous avons implémenté le modèle avec des servlets de Java Entreprise Edition
Modèle: les classes de Java
\newpage
\section{Cahier de Charge}
\textbf{Name}  :\newline
\newline
BricolExpress \newline \newline
 \textbf{Le but de projet }: \newline \newline
  - Mettre en relation les artisans et les clients qui ont besoin de service (réparation de la maison)\newline \newline
 -Les entreprises qui font ces services existent déjà, cependant les applications web existantes se limitent à un seul service (exemple : services du plombier)\newline \newline
 -Ce projet sert à rassembler tous les besoins ayant rapport avec la réparation de la maison\newline \newline
\textbf{Les utilisateurs bénéficiaires :} \newline \newline
 Le système sera utile à tous les clients propriétaires d’un bâtiment à réparer ou à la recherche d’un complément de revenu.
\newline \newline
\textbf{Fonctionnalité de système :
} \newline \newline
Pour le client
\newline \newline
-Création du compte client en entrant et vérifiant son email, et en remplissant un formulaire de ses coordonnées \newline \newline
-Accès à la plateforme en entrant l’email et le mot de passe \newline \newline
-Choix du service de réparation : \newline
-Choisir la date dans laquelle le client souhaite cette réparation\newline \newline
-Consulter la liste des services disponibles\newline \newline
Contacter le bricoleur qui se chargera de la réparation\newline \newline
\newline \newline
Pour le technicien

-Création du compte technicien en déterminant son métier, puis en remplissant un formulaire de ses cordonnées \newline \newline
-Définition d’horaire de disponibilité
\newline 
-Visite de son emploi de temps
\newline
-Définition temps de disponibilité
\newline
-Visite de son emploi de temps
\newline
-Changement de temps de disponibilité
\newline
-Accepter/refuser les demandes
\section{Les diagrammes de Classe et de cas d'utilisation }
\begin{figure}
    \centering
    \includegraphics{img/use case.png}
    \caption{Caption}
    \label{diagramme de use case}
\end{figure}
\begin{figure}
    \centering
    \includegraphics{img/class.png}
    \caption{diagramme de Classe}
    \label{fig:my_label}
\end{figure}
\newpage
\section{ENVIRONNEMENT DE DÉVELOPPEMENT}
Eclipse IDE for Java EE Developers est un outil pour développeurs Java qui
permet la création des applications web et JEE. Il inclut un environnement de
développement intégré pour Java, ainsi que des outils de développement
d'interface JEE, JDF et Mylyn.\newline \newline 
Il vient avec une structure modulaire qui est extensible en utilisant des
plugiciels, permettant ainsi le travail avec n'importe quel type de ressource :
graphiques, vidéo, modèles 3D, contenu web, etc. D'autres langues qui
peuvent aussi être utilisées dans Eclipse incluent C/C , PHP, Ruby, TCL et
Javascript. \newline \newline 
En tant qu'EDI java, il vient avec certaines fonctions intéressantes dont le
développement de groupes d'applications, le filtrage intégré et le test d'unité,
la construction et la compilation incrémentale, etc.
\newpage

\begin{figure}
    \centering
    \includegraphics{img/scre.png}
    \caption{Envirennement ECLIPSE}
    \label{fig:my_label}
\end{figure}
\newpage
\section{SERVEUR D'APPLICATIONSET TECHNOLOGIES UTILISÉS}
\subsection{Apache Tomcat JavaServer Pages}
Tomcat est un conteneur de Servlet
J2EE , Tomcat et
est désormais un projet principal de la
fondation Apache. C'est un conteneur
de Servlet J2EE qui implémente la
spécification des Servlets et des JSP de
Sun Microsystems. Tomcat est en fait
chargé de compiler les pages JSP pour en faire des Servlets (une
servlet étant une application Java qui
permet de générer dynamiquement des 
données au sein d'un serveur http).
Généralement, ces données sont
présentées sous forme de page HTML
coté client.
\section{PRESENTATION D'APPLICATION}

\newpage
\begin{figure}
    \centering
    \includegraphics[width=16cm, height=15cm ]{img/pageprin.png}
    \caption{PAGE PRINCIPALE}
    \label{fig:my_label}
\end{figure}
\newpage

\subsection{PAGE DE CONNECTION}
\begin{figure}
    \centering
    \includegraphics[width=16cm ,height=12cm]{img/conn.png}
    \caption{CONNEXION}
    \label{fig:my_label}
\end{figure}
\newpage
\subsection{PAGE D'INSCRIPTION }
\begin{figure}
    \centering
    \includegraphics[width=16cm ,height=12cm]{img/1ins.png}
    \caption{page de l'inscription}
    \label{fig:my_label}
\end{figure}
\newpage
\section{LE LIEN DE VEDEO DE L'APPLICATION }
\begin{center}
    \url{https://drive.google.com/file/d/1EG9jkdtSJuIkOEGrkmNr2IgTJ9OMaLTN/view?usp=sharing}
\url{ }
\end{center}
\end{document}
