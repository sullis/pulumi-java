// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeArtifactRemoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeArtifactRemoteArgs Empty = new GuestPoliciesRecipeArtifactRemoteArgs();

    /**
     * Must be provided if allowInsecure is false. SHA256 checksum in hex format, to compare to the checksum of the artifact.
     * If the checksum is not empty and it doesn't match the artifact then the recipe installation fails before running any
     * of the steps.
     * 
     */
    @InputImport(name="checkSum")
    private final @Nullable Input<String> checkSum;

    public Input<String> getCheckSum() {
        return this.checkSum == null ? Input.empty() : this.checkSum;
    }

    /**
     * URI from which to fetch the object. It should contain both the protocol and path following the format {protocol}://{location}.
     * 
     */
    @InputImport(name="uri")
    private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public GuestPoliciesRecipeArtifactRemoteArgs(
        @Nullable Input<String> checkSum,
        @Nullable Input<String> uri) {
        this.checkSum = checkSum;
        this.uri = uri;
    }

    private GuestPoliciesRecipeArtifactRemoteArgs() {
        this.checkSum = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeArtifactRemoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> checkSum;
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeArtifactRemoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkSum = defaults.checkSum;
    	      this.uri = defaults.uri;
        }

        public Builder setCheckSum(@Nullable Input<String> checkSum) {
            this.checkSum = checkSum;
            return this;
        }

        public Builder setCheckSum(@Nullable String checkSum) {
            this.checkSum = Input.ofNullable(checkSum);
            return this;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }

        public GuestPoliciesRecipeArtifactRemoteArgs build() {
            return new GuestPoliciesRecipeArtifactRemoteArgs(checkSum, uri);
        }
    }
}
