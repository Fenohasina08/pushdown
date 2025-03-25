import React from 'react';
import './About.css';
import imageFenohasina from '../Photos/Fenohasina-removebg-preview.png';

function About() {
  return (
    <section id="about">
      <div className="about-left">
        <h2>RA-FANOMEZANA Herimamy Fenohasina</h2>
        
      </div>
      <div className="about-right">
        <img src={imageFenohasina} alt="A propos de moi" />
      </div>
    </section>
  );
}

export default About;
