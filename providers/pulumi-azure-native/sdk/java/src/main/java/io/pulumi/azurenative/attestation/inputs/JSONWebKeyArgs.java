// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.attestation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JSONWebKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final JSONWebKeyArgs Empty = new JSONWebKeyArgs();

    /**
     * The "alg" (algorithm) parameter identifies the algorithm intended for
     * use with the key.  The values used should either be registered in the
     * IANA "JSON Web Signature and Encryption Algorithms" registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name.
     * 
     */
    @InputImport(name="alg")
    private final @Nullable Input<String> alg;

    public Input<String> getAlg() {
        return this.alg == null ? Input.empty() : this.alg;
    }

    /**
     * The "crv" (curve) parameter identifies the curve type
     * 
     */
    @InputImport(name="crv")
    private final @Nullable Input<String> crv;

    public Input<String> getCrv() {
        return this.crv == null ? Input.empty() : this.crv;
    }

    /**
     * RSA private exponent or ECC private key
     * 
     */
    @InputImport(name="d")
    private final @Nullable Input<String> d;

    public Input<String> getD() {
        return this.d == null ? Input.empty() : this.d;
    }

    /**
     * RSA Private Key Parameter
     * 
     */
    @InputImport(name="dp")
    private final @Nullable Input<String> dp;

    public Input<String> getDp() {
        return this.dp == null ? Input.empty() : this.dp;
    }

    /**
     * RSA Private Key Parameter
     * 
     */
    @InputImport(name="dq")
    private final @Nullable Input<String> dq;

    public Input<String> getDq() {
        return this.dq == null ? Input.empty() : this.dq;
    }

    /**
     * RSA public exponent, in Base64
     * 
     */
    @InputImport(name="e")
    private final @Nullable Input<String> e;

    public Input<String> getE() {
        return this.e == null ? Input.empty() : this.e;
    }

    /**
     * Symmetric key
     * 
     */
    @InputImport(name="k")
    private final @Nullable Input<String> k;

    public Input<String> getK() {
        return this.k == null ? Input.empty() : this.k;
    }

    /**
     * The "kid" (key ID) parameter is used to match a specific key.  This
     * is used, for instance, to choose among a set of keys within a JWK Set
     * during key rollover.  The structure of the "kid" value is
     * unspecified.  When "kid" values are used within a JWK Set, different
     * keys within the JWK Set SHOULD use distinct "kid" values.  (One
     * example in which different keys might use the same "kid" value is if
     * they have different "kty" (key type) values but are considered to be
     * equivalent alternatives by the application using them.)  The "kid"
     * value is a case-sensitive string.
     * 
     */
    @InputImport(name="kid")
    private final @Nullable Input<String> kid;

    public Input<String> getKid() {
        return this.kid == null ? Input.empty() : this.kid;
    }

    /**
     * The "kty" (key type) parameter identifies the cryptographic algorithm
     * family used with the key, such as "RSA" or "EC". "kty" values should
     * either be registered in the IANA "JSON Web Key Types" registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name.  The "kty" value is a case-sensitive string.
     * 
     */
    @InputImport(name="kty", required=true)
    private final Input<String> kty;

    public Input<String> getKty() {
        return this.kty;
    }

    /**
     * RSA modulus, in Base64
     * 
     */
    @InputImport(name="n")
    private final @Nullable Input<String> n;

    public Input<String> getN() {
        return this.n == null ? Input.empty() : this.n;
    }

    /**
     * RSA secret prime
     * 
     */
    @InputImport(name="p")
    private final @Nullable Input<String> p;

    public Input<String> getP() {
        return this.p == null ? Input.empty() : this.p;
    }

    /**
     * RSA secret prime, with p < q
     * 
     */
    @InputImport(name="q")
    private final @Nullable Input<String> q;

    public Input<String> getQ() {
        return this.q == null ? Input.empty() : this.q;
    }

    /**
     * RSA Private Key Parameter
     * 
     */
    @InputImport(name="qi")
    private final @Nullable Input<String> qi;

    public Input<String> getQi() {
        return this.qi == null ? Input.empty() : this.qi;
    }

    /**
     * Use ("public key use") identifies the intended use of
     * the public key. The "use" parameter is employed to indicate whether
     * a public key is used for encrypting data or verifying the signature
     * on data. Values are commonly "sig" (signature) or "enc" (encryption).
     * 
     */
    @InputImport(name="use")
    private final @Nullable Input<String> use;

    public Input<String> getUse() {
        return this.use == null ? Input.empty() : this.use;
    }

    /**
     * X coordinate for the Elliptic Curve point
     * 
     */
    @InputImport(name="x")
    private final @Nullable Input<String> x;

    public Input<String> getX() {
        return this.x == null ? Input.empty() : this.x;
    }

    /**
     * The "x5c" (X.509 certificate chain) parameter contains a chain of one
     * or more PKIX certificates [RFC5280].  The certificate chain is
     * represented as a JSON array of certificate value strings.  Each
     * string in the array is a base64-encoded (Section 4 of [RFC4648] --
     * not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value.
     * The PKIX certificate containing the key value MUST be the first
     * certificate.
     * 
     */
    @InputImport(name="x5c")
    private final @Nullable Input<List<String>> x5c;

    public Input<List<String>> getX5c() {
        return this.x5c == null ? Input.empty() : this.x5c;
    }

    /**
     * Y coordinate for the Elliptic Curve point
     * 
     */
    @InputImport(name="y")
    private final @Nullable Input<String> y;

    public Input<String> getY() {
        return this.y == null ? Input.empty() : this.y;
    }

    public JSONWebKeyArgs(
        @Nullable Input<String> alg,
        @Nullable Input<String> crv,
        @Nullable Input<String> d,
        @Nullable Input<String> dp,
        @Nullable Input<String> dq,
        @Nullable Input<String> e,
        @Nullable Input<String> k,
        @Nullable Input<String> kid,
        Input<String> kty,
        @Nullable Input<String> n,
        @Nullable Input<String> p,
        @Nullable Input<String> q,
        @Nullable Input<String> qi,
        @Nullable Input<String> use,
        @Nullable Input<String> x,
        @Nullable Input<List<String>> x5c,
        @Nullable Input<String> y) {
        this.alg = alg;
        this.crv = crv;
        this.d = d;
        this.dp = dp;
        this.dq = dq;
        this.e = e;
        this.k = k;
        this.kid = kid;
        this.kty = Objects.requireNonNull(kty, "expected parameter 'kty' to be non-null");
        this.n = n;
        this.p = p;
        this.q = q;
        this.qi = qi;
        this.use = use;
        this.x = x;
        this.x5c = x5c;
        this.y = y;
    }

    private JSONWebKeyArgs() {
        this.alg = Input.empty();
        this.crv = Input.empty();
        this.d = Input.empty();
        this.dp = Input.empty();
        this.dq = Input.empty();
        this.e = Input.empty();
        this.k = Input.empty();
        this.kid = Input.empty();
        this.kty = Input.empty();
        this.n = Input.empty();
        this.p = Input.empty();
        this.q = Input.empty();
        this.qi = Input.empty();
        this.use = Input.empty();
        this.x = Input.empty();
        this.x5c = Input.empty();
        this.y = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JSONWebKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alg;
        private @Nullable Input<String> crv;
        private @Nullable Input<String> d;
        private @Nullable Input<String> dp;
        private @Nullable Input<String> dq;
        private @Nullable Input<String> e;
        private @Nullable Input<String> k;
        private @Nullable Input<String> kid;
        private Input<String> kty;
        private @Nullable Input<String> n;
        private @Nullable Input<String> p;
        private @Nullable Input<String> q;
        private @Nullable Input<String> qi;
        private @Nullable Input<String> use;
        private @Nullable Input<String> x;
        private @Nullable Input<List<String>> x5c;
        private @Nullable Input<String> y;

        public Builder() {
    	      // Empty
        }

        public Builder(JSONWebKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alg = defaults.alg;
    	      this.crv = defaults.crv;
    	      this.d = defaults.d;
    	      this.dp = defaults.dp;
    	      this.dq = defaults.dq;
    	      this.e = defaults.e;
    	      this.k = defaults.k;
    	      this.kid = defaults.kid;
    	      this.kty = defaults.kty;
    	      this.n = defaults.n;
    	      this.p = defaults.p;
    	      this.q = defaults.q;
    	      this.qi = defaults.qi;
    	      this.use = defaults.use;
    	      this.x = defaults.x;
    	      this.x5c = defaults.x5c;
    	      this.y = defaults.y;
        }

        public Builder setAlg(@Nullable Input<String> alg) {
            this.alg = alg;
            return this;
        }

        public Builder setAlg(@Nullable String alg) {
            this.alg = Input.ofNullable(alg);
            return this;
        }

        public Builder setCrv(@Nullable Input<String> crv) {
            this.crv = crv;
            return this;
        }

        public Builder setCrv(@Nullable String crv) {
            this.crv = Input.ofNullable(crv);
            return this;
        }

        public Builder setD(@Nullable Input<String> d) {
            this.d = d;
            return this;
        }

        public Builder setD(@Nullable String d) {
            this.d = Input.ofNullable(d);
            return this;
        }

        public Builder setDp(@Nullable Input<String> dp) {
            this.dp = dp;
            return this;
        }

        public Builder setDp(@Nullable String dp) {
            this.dp = Input.ofNullable(dp);
            return this;
        }

        public Builder setDq(@Nullable Input<String> dq) {
            this.dq = dq;
            return this;
        }

        public Builder setDq(@Nullable String dq) {
            this.dq = Input.ofNullable(dq);
            return this;
        }

        public Builder setE(@Nullable Input<String> e) {
            this.e = e;
            return this;
        }

        public Builder setE(@Nullable String e) {
            this.e = Input.ofNullable(e);
            return this;
        }

        public Builder setK(@Nullable Input<String> k) {
            this.k = k;
            return this;
        }

        public Builder setK(@Nullable String k) {
            this.k = Input.ofNullable(k);
            return this;
        }

        public Builder setKid(@Nullable Input<String> kid) {
            this.kid = kid;
            return this;
        }

        public Builder setKid(@Nullable String kid) {
            this.kid = Input.ofNullable(kid);
            return this;
        }

        public Builder setKty(Input<String> kty) {
            this.kty = Objects.requireNonNull(kty);
            return this;
        }

        public Builder setKty(String kty) {
            this.kty = Input.of(Objects.requireNonNull(kty));
            return this;
        }

        public Builder setN(@Nullable Input<String> n) {
            this.n = n;
            return this;
        }

        public Builder setN(@Nullable String n) {
            this.n = Input.ofNullable(n);
            return this;
        }

        public Builder setP(@Nullable Input<String> p) {
            this.p = p;
            return this;
        }

        public Builder setP(@Nullable String p) {
            this.p = Input.ofNullable(p);
            return this;
        }

        public Builder setQ(@Nullable Input<String> q) {
            this.q = q;
            return this;
        }

        public Builder setQ(@Nullable String q) {
            this.q = Input.ofNullable(q);
            return this;
        }

        public Builder setQi(@Nullable Input<String> qi) {
            this.qi = qi;
            return this;
        }

        public Builder setQi(@Nullable String qi) {
            this.qi = Input.ofNullable(qi);
            return this;
        }

        public Builder setUse(@Nullable Input<String> use) {
            this.use = use;
            return this;
        }

        public Builder setUse(@Nullable String use) {
            this.use = Input.ofNullable(use);
            return this;
        }

        public Builder setX(@Nullable Input<String> x) {
            this.x = x;
            return this;
        }

        public Builder setX(@Nullable String x) {
            this.x = Input.ofNullable(x);
            return this;
        }

        public Builder setX5c(@Nullable Input<List<String>> x5c) {
            this.x5c = x5c;
            return this;
        }

        public Builder setX5c(@Nullable List<String> x5c) {
            this.x5c = Input.ofNullable(x5c);
            return this;
        }

        public Builder setY(@Nullable Input<String> y) {
            this.y = y;
            return this;
        }

        public Builder setY(@Nullable String y) {
            this.y = Input.ofNullable(y);
            return this;
        }

        public JSONWebKeyArgs build() {
            return new JSONWebKeyArgs(alg, crv, d, dp, dq, e, k, kid, kty, n, p, q, qi, use, x, x5c, y);
        }
    }
}
