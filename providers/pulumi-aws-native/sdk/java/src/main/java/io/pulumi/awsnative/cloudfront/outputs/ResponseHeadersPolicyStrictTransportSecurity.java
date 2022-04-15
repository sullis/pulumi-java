// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResponseHeadersPolicyStrictTransportSecurity {
    private final Integer accessControlMaxAgeSec;
    private final @Nullable Boolean includeSubdomains;
    private final Boolean override;
    private final @Nullable Boolean preload;

    @CustomType.Constructor
    private ResponseHeadersPolicyStrictTransportSecurity(
        @CustomType.Parameter("accessControlMaxAgeSec") Integer accessControlMaxAgeSec,
        @CustomType.Parameter("includeSubdomains") @Nullable Boolean includeSubdomains,
        @CustomType.Parameter("override") Boolean override,
        @CustomType.Parameter("preload") @Nullable Boolean preload) {
        this.accessControlMaxAgeSec = accessControlMaxAgeSec;
        this.includeSubdomains = includeSubdomains;
        this.override = override;
        this.preload = preload;
    }

    public Integer accessControlMaxAgeSec() {
        return this.accessControlMaxAgeSec;
    }
    public Optional<Boolean> includeSubdomains() {
        return Optional.ofNullable(this.includeSubdomains);
    }
    public Boolean override() {
        return this.override;
    }
    public Optional<Boolean> preload() {
        return Optional.ofNullable(this.preload);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyStrictTransportSecurity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer accessControlMaxAgeSec;
        private @Nullable Boolean includeSubdomains;
        private Boolean override;
        private @Nullable Boolean preload;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyStrictTransportSecurity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlMaxAgeSec = defaults.accessControlMaxAgeSec;
    	      this.includeSubdomains = defaults.includeSubdomains;
    	      this.override = defaults.override;
    	      this.preload = defaults.preload;
        }

        public Builder accessControlMaxAgeSec(Integer accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = Objects.requireNonNull(accessControlMaxAgeSec);
            return this;
        }
        public Builder includeSubdomains(@Nullable Boolean includeSubdomains) {
            this.includeSubdomains = includeSubdomains;
            return this;
        }
        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }
        public Builder preload(@Nullable Boolean preload) {
            this.preload = preload;
            return this;
        }        public ResponseHeadersPolicyStrictTransportSecurity build() {
            return new ResponseHeadersPolicyStrictTransportSecurity(accessControlMaxAgeSec, includeSubdomains, override, preload);
        }
    }
}
