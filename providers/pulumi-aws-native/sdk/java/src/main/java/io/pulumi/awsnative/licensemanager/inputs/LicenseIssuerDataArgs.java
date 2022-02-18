// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LicenseIssuerDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final LicenseIssuerDataArgs Empty = new LicenseIssuerDataArgs();

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="signKey")
    private final @Nullable Input<String> signKey;

    public Input<String> getSignKey() {
        return this.signKey == null ? Input.empty() : this.signKey;
    }

    public LicenseIssuerDataArgs(
        Input<String> name,
        @Nullable Input<String> signKey) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.signKey = signKey;
    }

    private LicenseIssuerDataArgs() {
        this.name = Input.empty();
        this.signKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseIssuerDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<String> signKey;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseIssuerDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.signKey = defaults.signKey;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSignKey(@Nullable Input<String> signKey) {
            this.signKey = signKey;
            return this;
        }

        public Builder setSignKey(@Nullable String signKey) {
            this.signKey = Input.ofNullable(signKey);
            return this;
        }

        public LicenseIssuerDataArgs build() {
            return new LicenseIssuerDataArgs(name, signKey);
        }
    }
}
