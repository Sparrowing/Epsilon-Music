import React from 'react';
import ReactDOM from 'react-dom';

import { Footer } from './frame/Footer';
import { NavBar } from './frame/NavBar';
import { IndexPage } from './index/IndexPage';

class App extends React.Component {
    render() {
        return (
            <div className="page-holder">
                <NavBar />
                <IndexPage />
                <Footer />
            </div>
        );
    }
}

ReactDOM.render(
		<App />,
		document.getElementById("root")
);
