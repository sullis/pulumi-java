// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetBackendBucketCdnPolicy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBackendBucketResult {
    private final String bucketName;
    private final List<GetBackendBucketCdnPolicy> cdnPolicies;
    private final String creationTimestamp;
    private final List<String> customResponseHeaders;
    private final String description;
    private final Boolean enableCdn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final @Nullable String project;
    private final String selfLink;

    @OutputCustomType.Constructor({"bucketName","cdnPolicies","creationTimestamp","customResponseHeaders","description","enableCdn","id","name","project","selfLink"})
    private GetBackendBucketResult(
        String bucketName,
        List<GetBackendBucketCdnPolicy> cdnPolicies,
        String creationTimestamp,
        List<String> customResponseHeaders,
        String description,
        Boolean enableCdn,
        String id,
        String name,
        @Nullable String project,
        String selfLink) {
        this.bucketName = Objects.requireNonNull(bucketName);
        this.cdnPolicies = Objects.requireNonNull(cdnPolicies);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.customResponseHeaders = Objects.requireNonNull(customResponseHeaders);
        this.description = Objects.requireNonNull(description);
        this.enableCdn = Objects.requireNonNull(enableCdn);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.project = project;
        this.selfLink = Objects.requireNonNull(selfLink);
    }

    public String getBucketName() {
        return this.bucketName;
    }
    public List<GetBackendBucketCdnPolicy> getCdnPolicies() {
        return this.cdnPolicies;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public List<String> getCustomResponseHeaders() {
        return this.customResponseHeaders;
    }
    public String getDescription() {
        return this.description;
    }
    public Boolean getEnableCdn() {
        return this.enableCdn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public String getSelfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendBucketResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private List<GetBackendBucketCdnPolicy> cdnPolicies;
        private String creationTimestamp;
        private List<String> customResponseHeaders;
        private String description;
        private Boolean enableCdn;
        private String id;
        private String name;
        private @Nullable String project;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.cdnPolicies = defaults.cdnPolicies;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.customResponseHeaders = defaults.customResponseHeaders;
    	      this.description = defaults.description;
    	      this.enableCdn = defaults.enableCdn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setCdnPolicies(List<GetBackendBucketCdnPolicy> cdnPolicies) {
            this.cdnPolicies = Objects.requireNonNull(cdnPolicies);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setCustomResponseHeaders(List<String> customResponseHeaders) {
            this.customResponseHeaders = Objects.requireNonNull(customResponseHeaders);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEnableCdn(Boolean enableCdn) {
            this.enableCdn = Objects.requireNonNull(enableCdn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public GetBackendBucketResult build() {
            return new GetBackendBucketResult(bucketName, cdnPolicies, creationTimestamp, customResponseHeaders, description, enableCdn, id, name, project, selfLink);
        }
    }
}
