// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetGameServerDeploymentResult {
    /**
     * @return The creation time.
     * 
     */
    private final String createTime;
    /**
     * @return Human readable description of the game server delpoyment.
     * 
     */
    private final String description;
    /**
     * @return ETag of the resource.
     * 
     */
    private final String etag;
    /**
     * @return The labels associated with this game server deployment. Each label is a key-value pair.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The resource name of the game server deployment, in the following form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-deployment`.
     * 
     */
    private final String name;
    /**
     * @return The last-modified time.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetGameServerDeploymentResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.etag = etag;
        this.labels = labels;
        this.name = name;
        this.updateTime = updateTime;
    }

    /**
     * @return The creation time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Human readable description of the game server delpoyment.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return ETag of the resource.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The labels associated with this game server deployment. Each label is a key-value pair.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The resource name of the game server deployment, in the following form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-deployment`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The last-modified time.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGameServerDeploymentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String etag;
        private Map<String,String> labels;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGameServerDeploymentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetGameServerDeploymentResult build() {
            return new GetGameServerDeploymentResult(createTime, description, etag, labels, name, updateTime);
        }
    }
}
