// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FieldLevelEncryptionConfigQueryArgProfileConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigQueryArgProfileConfigArgs Empty = new FieldLevelEncryptionConfigQueryArgProfileConfigArgs();

    /**
     * Flag to set if you want a request to be forwarded to the origin even if the profile specified by the field-level encryption query argument, fle-profile, is unknown.
     * 
     */
    @InputImport(name="forwardWhenQueryArgProfileIsUnknown", required=true)
      private final Input<Boolean> forwardWhenQueryArgProfileIsUnknown;

    public Input<Boolean> getForwardWhenQueryArgProfileIsUnknown() {
        return this.forwardWhenQueryArgProfileIsUnknown;
    }

    /**
     * Object that contains an attribute `items` that contains the list ofrofiles specified for query argument-profile mapping for field-level encryption. see Query Arg Profile.
     * 
     */
    @InputImport(name="queryArgProfiles")
      private final @Nullable Input<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs> queryArgProfiles;

    public Input<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs> getQueryArgProfiles() {
        return this.queryArgProfiles == null ? Input.empty() : this.queryArgProfiles;
    }

    public FieldLevelEncryptionConfigQueryArgProfileConfigArgs(
        Input<Boolean> forwardWhenQueryArgProfileIsUnknown,
        @Nullable Input<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs> queryArgProfiles) {
        this.forwardWhenQueryArgProfileIsUnknown = Objects.requireNonNull(forwardWhenQueryArgProfileIsUnknown, "expected parameter 'forwardWhenQueryArgProfileIsUnknown' to be non-null");
        this.queryArgProfiles = queryArgProfiles;
    }

    private FieldLevelEncryptionConfigQueryArgProfileConfigArgs() {
        this.forwardWhenQueryArgProfileIsUnknown = Input.empty();
        this.queryArgProfiles = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigQueryArgProfileConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> forwardWhenQueryArgProfileIsUnknown;
        private @Nullable Input<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs> queryArgProfiles;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigQueryArgProfileConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardWhenQueryArgProfileIsUnknown = defaults.forwardWhenQueryArgProfileIsUnknown;
    	      this.queryArgProfiles = defaults.queryArgProfiles;
        }

        public Builder setForwardWhenQueryArgProfileIsUnknown(Input<Boolean> forwardWhenQueryArgProfileIsUnknown) {
            this.forwardWhenQueryArgProfileIsUnknown = Objects.requireNonNull(forwardWhenQueryArgProfileIsUnknown);
            return this;
        }

        public Builder setForwardWhenQueryArgProfileIsUnknown(Boolean forwardWhenQueryArgProfileIsUnknown) {
            this.forwardWhenQueryArgProfileIsUnknown = Input.of(Objects.requireNonNull(forwardWhenQueryArgProfileIsUnknown));
            return this;
        }

        public Builder setQueryArgProfiles(@Nullable Input<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs> queryArgProfiles) {
            this.queryArgProfiles = queryArgProfiles;
            return this;
        }

        public Builder setQueryArgProfiles(@Nullable FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs queryArgProfiles) {
            this.queryArgProfiles = Input.ofNullable(queryArgProfiles);
            return this;
        }
        public FieldLevelEncryptionConfigQueryArgProfileConfigArgs build() {
            return new FieldLevelEncryptionConfigQueryArgProfileConfigArgs(forwardWhenQueryArgProfileIsUnknown, queryArgProfiles);
        }
    }
}