package redef.tls.params
// scalafmt: { maxColumn = 150, align.preset = most, align.tokens."+" =  [{ code = "with" }] }

/// TLS ClientCertificateType Identifiers
enum ClientCertificateType(val code: Short, val name: String):
  // 0 Unassigned
  case RsaSign        extends ClientCertificateType(1, "rsa_sign")
  case DssSign        extends ClientCertificateType(2, "dss_sign")
  case RsaFixedDh     extends ClientCertificateType(3, "rsa_fixed_dh")
  case DssFixedDh     extends ClientCertificateType(4, "dss_fixed_dh")
  case RsaEphemeralDh extends ClientCertificateType(5, "rsa_ephemeral_dh_RESERVED")
  case DssEphemeralDh extends ClientCertificateType(6, "dss_ephemeral_dh_RESERVED")
  // 7-19 Unassigned
  case FortezzaDms extends ClientCertificateType(20, "fortezza_dms_RESERVED")
  // 21-63 Unassigned
  case EcdsaSign      extends ClientCertificateType(64, "ecdsa_sign")
  case RsaFixedEcdh   extends ClientCertificateType(65, "rsa_fixed_ecdh")
  case EcdsaFixedEcdh extends ClientCertificateType(66, "ecdsa_fixed_ecdh")
  case GostSign256    extends ClientCertificateType(67, "gost_sign256")
  case GostSign512    extends ClientCertificateType(68, "gost_sign512")
  // 69-223 Unassigned
  // 224-255 Reserved for Private Use
