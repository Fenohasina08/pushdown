import { useState } from "react";
import { FiMenu, FiX } from "react-icons/fi"; // Icônes de menu
import styles from "./Header.module.css";
import { motion } from "framer-motion"

function Header() {
    const [menuOpen, setMenuOpen] = useState(false);

    const toggleMenu = () => {
        setMenuOpen(!menuOpen);
    };

    return (
        <motion.header 
            className={styles.header}
            initial={{ y: -100, opacity: 0 }} // Animation d'entrée
            animate={{ y: 0, opacity: 1 }} 
            transition={{ duration: 1.6, ease: "easeOut" }} // Durée et fluidité
        >
            <h1>Fenohasina</h1>
            <nav className={`${styles.nav} ${menuOpen ? styles.active : ""}`}>
                <motion.ul 
                    initial={{ opacity: 0, x: -50 }}
                    animate={{ opacity: 1, x: 0 }}
                    transition={{ duration: 0.5 }}
                >
                    
                    <li><a href="./About.js">About me</a></li>
                    <li><a href="./Projects.js">Projects</a></li>
                    <li><a href="./Technologies.js">Technologies</a></li>
                    <li><a href="./Contact.js">Contact</a></li>
                   
                </motion.ul>
            </nav>
            
            {/* Icône du menu burger animée */}
            <motion.div 
                className={styles.burger} 
                onClick={toggleMenu}
                whileTap={{ scale: 0.9 }} // Effet d’appui sur l’icône
            >
                {menuOpen ? <FiX size={30} /> : <FiMenu size={30} />}
            </motion.div>
        </motion.header>
    );
}

export default Header;
