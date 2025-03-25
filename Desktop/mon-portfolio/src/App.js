// src/App.js
import React, { useEffect } from 'react';
import Header from './components/Header';
import About from './components/About';
import Projects from './components/Projects';
import Contact from './components/Contact';
import Technologies from './components/Technologies';

function App() {
  useEffect(() => {
    // Initialisation de particles.js avec des couleurs chromatiques
    window.particlesJS('particles-js', {
      particles: {
        number: {
          value: 70, // Nombre de particules
        },
        size: {
          value: 1.5, // Taille des particules
        },
        color: {
          value: ['#5b9bd5', '#00b8a9', '#f7e53c'], // Trois couleurs harmonieuses
        },
        move: {
          enable: true,
          speed: 1, // Vitesse des particules
          direction: 'none', // Mouvement libre
          random: true, // Déplacement aléatoire
          straight: false, // Mouvement fluide
        },
        line_linked: {
          enable: false, // Pas de liaisons entre les particules
        },
      },
    });
  }, []);

  return (
    <div className="App">
      <Header />
      <About />
      <Projects />
      <Contact />
      <Technologies />
    </div>
  );
}

export default App;
