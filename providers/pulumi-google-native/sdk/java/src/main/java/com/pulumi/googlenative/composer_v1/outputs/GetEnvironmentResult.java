// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.composer_v1.outputs.EnvironmentConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetEnvironmentResult {
    /**
     * @return Configuration parameters for this environment.
     * 
     */
    private final EnvironmentConfigResponse config;
    /**
     * @return The time at which this environment was created.
     * 
     */
    private final String createTime;
    /**
     * @return Optional. User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map are UTF8 strings that comply with the following restrictions: * Keys must conform to regexp: \p{Ll}\p{Lo}{0,62} * Values must conform to regexp: [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally constrained to be &lt;= 128 bytes in size.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The resource name of the environment, in the form: &#34;projects/{projectId}/locations/{locationId}/environments/{environmentId}&#34; EnvironmentId must start with a lowercase letter followed by up to 63 lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * 
     */
    private final String name;
    /**
     * @return The current state of the environment.
     * 
     */
    private final String state;
    /**
     * @return The time at which this environment was last modified.
     * 
     */
    private final String updateTime;
    /**
     * @return The UUID (Universally Unique IDentifier) associated with this environment. This value is generated when the environment is created.
     * 
     */
    private final String uuid;

    @CustomType.Constructor
    private GetEnvironmentResult(
        @CustomType.Parameter("config") EnvironmentConfigResponse config,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("uuid") String uuid) {
        this.config = config;
        this.createTime = createTime;
        this.labels = labels;
        this.name = name;
        this.state = state;
        this.updateTime = updateTime;
        this.uuid = uuid;
    }

    /**
     * @return Configuration parameters for this environment.
     * 
     */
    public EnvironmentConfigResponse config() {
        return this.config;
    }
    /**
     * @return The time at which this environment was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map are UTF8 strings that comply with the following restrictions: * Keys must conform to regexp: \p{Ll}\p{Lo}{0,62} * Values must conform to regexp: [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally constrained to be &lt;= 128 bytes in size.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The resource name of the environment, in the form: &#34;projects/{projectId}/locations/{locationId}/environments/{environmentId}&#34; EnvironmentId must start with a lowercase letter followed by up to 63 lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current state of the environment.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The time at which this environment was last modified.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return The UUID (Universally Unique IDentifier) associated with this environment. This value is generated when the environment is created.
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentConfigResponse config;
        private String createTime;
        private Map<String,String> labels;
        private String name;
        private String state;
        private String updateTime;
        private String uuid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.createTime = defaults.createTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
    	      this.uuid = defaults.uuid;
        }

        public Builder config(EnvironmentConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
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
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(config, createTime, labels, name, state, updateTime, uuid);
        }
    }
}
