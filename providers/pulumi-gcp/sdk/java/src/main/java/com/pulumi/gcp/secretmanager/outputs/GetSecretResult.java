// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.secretmanager.outputs.GetSecretReplication;
import com.pulumi.gcp.secretmanager.outputs.GetSecretRotation;
import com.pulumi.gcp.secretmanager.outputs.GetSecretTopic;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecretResult {
    private final String createTime;
    private final String expireTime;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Map<String,String> labels;
    private final String name;
    private final @Nullable String project;
    private final List<GetSecretReplication> replications;
    private final List<GetSecretRotation> rotations;
    private final String secretId;
    private final List<GetSecretTopic> topics;
    private final String ttl;

    @CustomType.Constructor
    private GetSecretResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("replications") List<GetSecretReplication> replications,
        @CustomType.Parameter("rotations") List<GetSecretRotation> rotations,
        @CustomType.Parameter("secretId") String secretId,
        @CustomType.Parameter("topics") List<GetSecretTopic> topics,
        @CustomType.Parameter("ttl") String ttl) {
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.id = id;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.replications = replications;
        this.rotations = rotations;
        this.secretId = secretId;
        this.topics = topics;
        this.ttl = ttl;
    }

    public String createTime() {
        return this.createTime;
    }
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public List<GetSecretReplication> replications() {
        return this.replications;
    }
    public List<GetSecretRotation> rotations() {
        return this.rotations;
    }
    public String secretId() {
        return this.secretId;
    }
    public List<GetSecretTopic> topics() {
        return this.topics;
    }
    public String ttl() {
        return this.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String expireTime;
        private String id;
        private Map<String,String> labels;
        private String name;
        private @Nullable String project;
        private List<GetSecretReplication> replications;
        private List<GetSecretRotation> rotations;
        private String secretId;
        private List<GetSecretTopic> topics;
        private String ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.replications = defaults.replications;
    	      this.rotations = defaults.rotations;
    	      this.secretId = defaults.secretId;
    	      this.topics = defaults.topics;
    	      this.ttl = defaults.ttl;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder replications(List<GetSecretReplication> replications) {
            this.replications = Objects.requireNonNull(replications);
            return this;
        }
        public Builder replications(GetSecretReplication... replications) {
            return replications(List.of(replications));
        }
        public Builder rotations(List<GetSecretRotation> rotations) {
            this.rotations = Objects.requireNonNull(rotations);
            return this;
        }
        public Builder rotations(GetSecretRotation... rotations) {
            return rotations(List.of(rotations));
        }
        public Builder secretId(String secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }
        public Builder topics(List<GetSecretTopic> topics) {
            this.topics = Objects.requireNonNull(topics);
            return this;
        }
        public Builder topics(GetSecretTopic... topics) {
            return topics(List.of(topics));
        }
        public Builder ttl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }        public GetSecretResult build() {
            return new GetSecretResult(createTime, expireTime, id, labels, name, project, replications, rotations, secretId, topics, ttl);
        }
    }
}
