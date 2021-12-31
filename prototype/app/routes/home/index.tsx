import type { LoaderFunction } from "remix";
import { useLoaderData, Link, useCatch } from "remix";

export default function HomeIndexRoute() {
  return (
    <div>
      <p>Welcome to Home.</p>
    </div>
  );
}
