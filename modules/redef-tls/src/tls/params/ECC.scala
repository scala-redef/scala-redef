package redef.tls.params

// scalafmt: { maxColumn = 150, align.preset = most, align.tokens."+" =  [{ code = "with" }] }

/// TLS EC Point Formats
enum EccPointFormat(val code: Short, val name: String):
  case Uncompressed            extends EccPointFormat(0, "uncompressed")
  case AnsiX962CompressedPrime extends EccPointFormat(1, "ansiX962_compressed_prime")
  case AnsiX962CompressedChar2 extends EccPointFormat(2, "ansiX962_compressed_char2")
  // 3-247 Unassigned
  // 248-255 Reserved for Private Use
end EccPointFormat

/// TLS EC Curve Types
enum EccType(val code: Short, val name: String):
  case ExplicitPrime extends EccType(1, "explicit_prime")
  case ExplicitChar2 extends EccType(2, "explicit_char2")
  case NamedCurve    extends EccType(3, "named_curve")
  // 4-247 Unassigned
  // 248-255 Reserved for Private Use
end EccType
