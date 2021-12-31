import { Link } from "remix";
export default function Index() {
  return (
    <div className="container">
      <div className="content">
        <h1>
          UA4IUGI <span>Prototype!</span>
        </h1>
        <nav>
          <ul>
            <li>
              <Link to="home">Home</Link>
            </li>
          </ul>
        </nav>
      </div>
    </div>
  );
}
