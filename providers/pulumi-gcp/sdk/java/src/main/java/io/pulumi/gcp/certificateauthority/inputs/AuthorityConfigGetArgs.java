// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigSubjectConfigGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigGetArgs;
import java.util.Objects;


public final class AuthorityConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigGetArgs Empty = new AuthorityConfigGetArgs();

    /**
     * Specifies some of the values in a certificate that are related to the subject.
     * Structure is documented below.
     * 
     */
    @InputImport(name="subjectConfig", required=true)
    private final Input<AuthorityConfigSubjectConfigGetArgs> subjectConfig;

    public Input<AuthorityConfigSubjectConfigGetArgs> getSubjectConfig() {
        return this.subjectConfig;
    }

    /**
     * Describes how some of the technical X.509 fields in a certificate should be populated.
     * Structure is documented below.
     * 
     */
    @InputImport(name="x509Config", required=true)
    private final Input<AuthorityConfigX509ConfigGetArgs> x509Config;

    public Input<AuthorityConfigX509ConfigGetArgs> getX509Config() {
        return this.x509Config;
    }

    public AuthorityConfigGetArgs(
        Input<AuthorityConfigSubjectConfigGetArgs> subjectConfig,
        Input<AuthorityConfigX509ConfigGetArgs> x509Config) {
        this.subjectConfig = Objects.requireNonNull(subjectConfig, "expected parameter 'subjectConfig' to be non-null");
        this.x509Config = Objects.requireNonNull(x509Config, "expected parameter 'x509Config' to be non-null");
    }

    private AuthorityConfigGetArgs() {
        this.subjectConfig = Input.empty();
        this.x509Config = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AuthorityConfigSubjectConfigGetArgs> subjectConfig;
        private Input<AuthorityConfigX509ConfigGetArgs> x509Config;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectConfig = defaults.subjectConfig;
    	      this.x509Config = defaults.x509Config;
        }

        public Builder setSubjectConfig(Input<AuthorityConfigSubjectConfigGetArgs> subjectConfig) {
            this.subjectConfig = Objects.requireNonNull(subjectConfig);
            return this;
        }

        public Builder setSubjectConfig(AuthorityConfigSubjectConfigGetArgs subjectConfig) {
            this.subjectConfig = Input.of(Objects.requireNonNull(subjectConfig));
            return this;
        }

        public Builder setX509Config(Input<AuthorityConfigX509ConfigGetArgs> x509Config) {
            this.x509Config = Objects.requireNonNull(x509Config);
            return this;
        }

        public Builder setX509Config(AuthorityConfigX509ConfigGetArgs x509Config) {
            this.x509Config = Input.of(Objects.requireNonNull(x509Config));
            return this;
        }

        public AuthorityConfigGetArgs build() {
            return new AuthorityConfigGetArgs(subjectConfig, x509Config);
        }
    }
}
