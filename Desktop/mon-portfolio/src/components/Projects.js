// src/components/Projects.js
import React from 'react';
import './Projects.css';
function Projects() {
    return (
        <section id="projects">
            <h2>Mes Projets</h2>
            <div className="project-list">
                <div className="project">
                    <h3>Projet 1</h3>
                    <p>Description du projet 1</p>
                </div>
                <div className="project">
                    <h3>Projet 2</h3>
                    <p>Description du projet 2</p>
                </div>
                <div className="project">
                    <h3>Projet 3</h3>
                    <p>Description du projet 2</p>
                </div>
                <div className="project">
                    <h3>Projet 4</h3>
                    <p>Description du projet 2</p>
                </div>
            </div>
        </section>
    );
}

export default Projects;
