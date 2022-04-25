// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SsisEnvironmentReferenceResponse {
    /**
     * @return Environment folder name.
     * 
     */
    private final @Nullable String environmentFolderName;
    /**
     * @return Environment name.
     * 
     */
    private final @Nullable String environmentName;
    /**
     * @return Environment reference id.
     * 
     */
    private final @Nullable Double id;
    /**
     * @return Reference type
     * 
     */
    private final @Nullable String referenceType;

    @CustomType.Constructor
    private SsisEnvironmentReferenceResponse(
        @CustomType.Parameter("environmentFolderName") @Nullable String environmentFolderName,
        @CustomType.Parameter("environmentName") @Nullable String environmentName,
        @CustomType.Parameter("id") @Nullable Double id,
        @CustomType.Parameter("referenceType") @Nullable String referenceType) {
        this.environmentFolderName = environmentFolderName;
        this.environmentName = environmentName;
        this.id = id;
        this.referenceType = referenceType;
    }

    /**
     * @return Environment folder name.
     * 
     */
    public Optional<String> environmentFolderName() {
        return Optional.ofNullable(this.environmentFolderName);
    }
    /**
     * @return Environment name.
     * 
     */
    public Optional<String> environmentName() {
        return Optional.ofNullable(this.environmentName);
    }
    /**
     * @return Environment reference id.
     * 
     */
    public Optional<Double> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Reference type
     * 
     */
    public Optional<String> referenceType() {
        return Optional.ofNullable(this.referenceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisEnvironmentReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String environmentFolderName;
        private @Nullable String environmentName;
        private @Nullable Double id;
        private @Nullable String referenceType;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisEnvironmentReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentFolderName = defaults.environmentFolderName;
    	      this.environmentName = defaults.environmentName;
    	      this.id = defaults.id;
    	      this.referenceType = defaults.referenceType;
        }

        public Builder environmentFolderName(@Nullable String environmentFolderName) {
            this.environmentFolderName = environmentFolderName;
            return this;
        }
        public Builder environmentName(@Nullable String environmentName) {
            this.environmentName = environmentName;
            return this;
        }
        public Builder id(@Nullable Double id) {
            this.id = id;
            return this;
        }
        public Builder referenceType(@Nullable String referenceType) {
            this.referenceType = referenceType;
            return this;
        }        public SsisEnvironmentReferenceResponse build() {
            return new SsisEnvironmentReferenceResponse(environmentFolderName, environmentName, id, referenceType);
        }
    }
}
