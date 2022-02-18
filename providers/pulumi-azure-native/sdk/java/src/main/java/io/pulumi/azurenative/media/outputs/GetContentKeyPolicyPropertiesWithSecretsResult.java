// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.ContentKeyPolicyOptionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetContentKeyPolicyPropertiesWithSecretsResult {
    /**
     * The creation date of the Policy
     * 
     */
    private final String created;
    /**
     * A description for the Policy.
     * 
     */
    private final @Nullable String description;
    /**
     * The last modified date of the Policy
     * 
     */
    private final String lastModified;
    /**
     * The Key Policy options.
     * 
     */
    private final List<ContentKeyPolicyOptionResponse> options;
    /**
     * The legacy Policy ID.
     * 
     */
    private final String policyId;

    @OutputCustomType.Constructor({"created","description","lastModified","options","policyId"})
    private GetContentKeyPolicyPropertiesWithSecretsResult(
        String created,
        @Nullable String description,
        String lastModified,
        List<ContentKeyPolicyOptionResponse> options,
        String policyId) {
        this.created = Objects.requireNonNull(created);
        this.description = description;
        this.lastModified = Objects.requireNonNull(lastModified);
        this.options = Objects.requireNonNull(options);
        this.policyId = Objects.requireNonNull(policyId);
    }

    /**
     * The creation date of the Policy
     * 
     */
    public String getCreated() {
        return this.created;
    }
    /**
     * A description for the Policy.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The last modified date of the Policy
     * 
     */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * The Key Policy options.
     * 
     */
    public List<ContentKeyPolicyOptionResponse> getOptions() {
        return this.options;
    }
    /**
     * The legacy Policy ID.
     * 
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContentKeyPolicyPropertiesWithSecretsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String created;
        private @Nullable String description;
        private String lastModified;
        private List<ContentKeyPolicyOptionResponse> options;
        private String policyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContentKeyPolicyPropertiesWithSecretsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.description = defaults.description;
    	      this.lastModified = defaults.lastModified;
    	      this.options = defaults.options;
    	      this.policyId = defaults.policyId;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setOptions(List<ContentKeyPolicyOptionResponse> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }

        public Builder setPolicyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }

        public GetContentKeyPolicyPropertiesWithSecretsResult build() {
            return new GetContentKeyPolicyPropertiesWithSecretsResult(created, description, lastModified, options, policyId);
        }
    }
}
