import React from 'react';

class NavBarTitle extends React.Component {
    render() {
        return <a className="navbar-brand" href="/">Epsilon</a>;
    }
}

class NavBarLink extends React.Component {

	constructor(props) {
		super(props);
		this.state = { isActive: (props.isActive) };
	}

    render() {

        return (
            <li className="nav-item">
                <a className=
                    {"nav-link" + (!this.state.isActive ? ' ' + 'inactive' : '')}
                    href={this.props.path}>
                        {this.props.name}
                </a>
            </li>
        )
    }
}

export class NavBar extends React.Component {

    render() {
        const links = [
            {
                name: "Home",
                path: "/",
                isActive: true,
            },

            {
            	name: "Explore",
            	path: "/",
            	isActive: false,
            },

            {
            	name: "My Playlists",
            	path: "/",
            	isActive: false,
            },

            {
            	name: "Recent",
            	path: "/",
            	isActive: false,
            },
        ];

        return (
        		<nav className="navbar navbar-static-top navbar-custom">

        			<NavBarTitle />

        			<ul className="nav navbar-nav">

        				{
	        				links.map((link) =>
	        					<NavBarLink name={link.name} path={link.path} isActive={link.isActive} />
	        				)
        				}

        			</ul>

        		</nav>
        );
    }
}
