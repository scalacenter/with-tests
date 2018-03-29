package hello

object Hello {
  def greet(name: String): String = {
    // We do this to check that environment variables work
    sys.env.get("BLOOP_OWNER").getOrElse(sys.error("Missing BLOOP_OWNER env variable!"))
    s"Hello, $name!"
  }
}
