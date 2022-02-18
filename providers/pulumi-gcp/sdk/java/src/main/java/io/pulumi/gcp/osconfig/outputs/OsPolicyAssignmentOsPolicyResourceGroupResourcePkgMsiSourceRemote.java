// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceRemote {
    /**
     * SHA256 checksum of the remote file.
     * 
     */
    private final @Nullable String sha256Checksum;
    /**
     * Required. URI for this repository.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"sha256Checksum","uri"})
    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceRemote(
        @Nullable String sha256Checksum,
        String uri) {
        this.sha256Checksum = sha256Checksum;
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * SHA256 checksum of the remote file.
     * 
     */
    public Optional<String> getSha256Checksum() {
        return Optional.ofNullable(this.sha256Checksum);
    }
    /**
     * Required. URI for this repository.
     * 
     */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceRemote defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sha256Checksum;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceRemote defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sha256Checksum = defaults.sha256Checksum;
    	      this.uri = defaults.uri;
        }

        public Builder setSha256Checksum(@Nullable String sha256Checksum) {
            this.sha256Checksum = sha256Checksum;
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceRemote build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceRemote(sha256Checksum, uri);
        }
    }
}
