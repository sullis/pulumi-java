// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PackageStorageLocation {
    private final @Nullable String binaryPrefixLocation;
    private final @Nullable String bucket;
    private final @Nullable String generatedPrefixLocation;
    private final @Nullable String manifestPrefixLocation;
    private final @Nullable String repoPrefixLocation;

    @OutputCustomType.Constructor
    private PackageStorageLocation(
        @OutputCustomType.Parameter("binaryPrefixLocation") @Nullable String binaryPrefixLocation,
        @OutputCustomType.Parameter("bucket") @Nullable String bucket,
        @OutputCustomType.Parameter("generatedPrefixLocation") @Nullable String generatedPrefixLocation,
        @OutputCustomType.Parameter("manifestPrefixLocation") @Nullable String manifestPrefixLocation,
        @OutputCustomType.Parameter("repoPrefixLocation") @Nullable String repoPrefixLocation) {
        this.binaryPrefixLocation = binaryPrefixLocation;
        this.bucket = bucket;
        this.generatedPrefixLocation = generatedPrefixLocation;
        this.manifestPrefixLocation = manifestPrefixLocation;
        this.repoPrefixLocation = repoPrefixLocation;
    }

    public Optional<String> getBinaryPrefixLocation() {
        return Optional.ofNullable(this.binaryPrefixLocation);
    }
    public Optional<String> getBucket() {
        return Optional.ofNullable(this.bucket);
    }
    public Optional<String> getGeneratedPrefixLocation() {
        return Optional.ofNullable(this.generatedPrefixLocation);
    }
    public Optional<String> getManifestPrefixLocation() {
        return Optional.ofNullable(this.manifestPrefixLocation);
    }
    public Optional<String> getRepoPrefixLocation() {
        return Optional.ofNullable(this.repoPrefixLocation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageStorageLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String binaryPrefixLocation;
        private @Nullable String bucket;
        private @Nullable String generatedPrefixLocation;
        private @Nullable String manifestPrefixLocation;
        private @Nullable String repoPrefixLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageStorageLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binaryPrefixLocation = defaults.binaryPrefixLocation;
    	      this.bucket = defaults.bucket;
    	      this.generatedPrefixLocation = defaults.generatedPrefixLocation;
    	      this.manifestPrefixLocation = defaults.manifestPrefixLocation;
    	      this.repoPrefixLocation = defaults.repoPrefixLocation;
        }

        public Builder setBinaryPrefixLocation(@Nullable String binaryPrefixLocation) {
            this.binaryPrefixLocation = binaryPrefixLocation;
            return this;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setGeneratedPrefixLocation(@Nullable String generatedPrefixLocation) {
            this.generatedPrefixLocation = generatedPrefixLocation;
            return this;
        }

        public Builder setManifestPrefixLocation(@Nullable String manifestPrefixLocation) {
            this.manifestPrefixLocation = manifestPrefixLocation;
            return this;
        }

        public Builder setRepoPrefixLocation(@Nullable String repoPrefixLocation) {
            this.repoPrefixLocation = repoPrefixLocation;
            return this;
        }
        public PackageStorageLocation build() {
            return new PackageStorageLocation(binaryPrefixLocation, bucket, generatedPrefixLocation, manifestPrefixLocation, repoPrefixLocation);
        }
    }
}
