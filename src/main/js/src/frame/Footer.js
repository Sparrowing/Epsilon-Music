import React from 'react';
import { GitHubLink } from '../links';

class FooterContent extends React.Component {

    render() {
        return <p>Mel Grigg | <GitHubLink /> | 2017</p>;
    }
}

export class Footer extends React.Component {

    render() {

        return (
            <footer className="footer navbar-fixed-bottom footer-custom">
                <small>
                    <FooterContent />
                </small>
            </footer>
        );
    }
}
