// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.azurenative.containerregistry.outputs.SourceControlAuthInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListBuildTaskSourceRepositoryPropertiesResult {
    /**
     * @return The value of this property indicates whether the source control commit trigger is enabled or not.
     * 
     */
    private final @Nullable Boolean isCommitTriggerEnabled;
    /**
     * @return The full URL to the source code repository
     * 
     */
    private final String repositoryUrl;
    /**
     * @return The authorization properties for accessing the source code repository.
     * 
     */
    private final @Nullable SourceControlAuthInfoResponse sourceControlAuthProperties;
    /**
     * @return The type of source control service.
     * 
     */
    private final String sourceControlType;

    @CustomType.Constructor
    private ListBuildTaskSourceRepositoryPropertiesResult(
        @CustomType.Parameter("isCommitTriggerEnabled") @Nullable Boolean isCommitTriggerEnabled,
        @CustomType.Parameter("repositoryUrl") String repositoryUrl,
        @CustomType.Parameter("sourceControlAuthProperties") @Nullable SourceControlAuthInfoResponse sourceControlAuthProperties,
        @CustomType.Parameter("sourceControlType") String sourceControlType) {
        this.isCommitTriggerEnabled = isCommitTriggerEnabled;
        this.repositoryUrl = repositoryUrl;
        this.sourceControlAuthProperties = sourceControlAuthProperties;
        this.sourceControlType = sourceControlType;
    }

    /**
     * @return The value of this property indicates whether the source control commit trigger is enabled or not.
     * 
     */
    public Optional<Boolean> isCommitTriggerEnabled() {
        return Optional.ofNullable(this.isCommitTriggerEnabled);
    }
    /**
     * @return The full URL to the source code repository
     * 
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }
    /**
     * @return The authorization properties for accessing the source code repository.
     * 
     */
    public Optional<SourceControlAuthInfoResponse> sourceControlAuthProperties() {
        return Optional.ofNullable(this.sourceControlAuthProperties);
    }
    /**
     * @return The type of source control service.
     * 
     */
    public String sourceControlType() {
        return this.sourceControlType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListBuildTaskSourceRepositoryPropertiesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isCommitTriggerEnabled;
        private String repositoryUrl;
        private @Nullable SourceControlAuthInfoResponse sourceControlAuthProperties;
        private String sourceControlType;

        public Builder() {
    	      // Empty
        }

        public Builder(ListBuildTaskSourceRepositoryPropertiesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCommitTriggerEnabled = defaults.isCommitTriggerEnabled;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.sourceControlAuthProperties = defaults.sourceControlAuthProperties;
    	      this.sourceControlType = defaults.sourceControlType;
        }

        public Builder isCommitTriggerEnabled(@Nullable Boolean isCommitTriggerEnabled) {
            this.isCommitTriggerEnabled = isCommitTriggerEnabled;
            return this;
        }
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }
        public Builder sourceControlAuthProperties(@Nullable SourceControlAuthInfoResponse sourceControlAuthProperties) {
            this.sourceControlAuthProperties = sourceControlAuthProperties;
            return this;
        }
        public Builder sourceControlType(String sourceControlType) {
            this.sourceControlType = Objects.requireNonNull(sourceControlType);
            return this;
        }        public ListBuildTaskSourceRepositoryPropertiesResult build() {
            return new ListBuildTaskSourceRepositoryPropertiesResult(isCommitTriggerEnabled, repositoryUrl, sourceControlAuthProperties, sourceControlType);
        }
    }
}
