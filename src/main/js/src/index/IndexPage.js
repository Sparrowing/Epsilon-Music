import React from 'react';

class IndexContent extends React.Component {
    render() {
        return (
            <div className="placeholder">
                <p>Under construction!</p>
            </div>
        );
    }
}

export class IndexPage extends React.Component {

    render() {

        return (
            <div class="container-fluid page-content">
                <IndexContent />
            </div>
        );
    }
}
