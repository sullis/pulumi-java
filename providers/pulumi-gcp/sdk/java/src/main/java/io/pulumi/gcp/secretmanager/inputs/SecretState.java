// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.secretmanager.inputs.SecretReplicationGetArgs;
import io.pulumi.gcp.secretmanager.inputs.SecretRotationGetArgs;
import io.pulumi.gcp.secretmanager.inputs.SecretTopicGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretState extends io.pulumi.resources.ResourceArgs {

    public static final SecretState Empty = new SecretState();

    /**
     * The time at which the Secret was created.
     * 
     */
    @InputImport(name="createTime")
      private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * Timestamp in UTC when the Secret is scheduled to expire. This is always provided on output, regardless of what was sent on input.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="expireTime")
      private final @Nullable Input<String> expireTime;

    public Input<String> getExpireTime() {
        return this.expireTime == null ? Input.empty() : this.expireTime;
    }

    /**
     * The labels assigned to this Secret.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
     * and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
     * and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be assigned to a given resource.
     * An object containing a list of "key": value pairs. Example:
     * { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The resource name of the Pub/Sub topic that will be published to, in the following format: projects/*{@literal /}topics/*.
     * For publication to succeed, the Secret Manager Service Agent service account must have pubsub.publisher permissions on the topic.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The replication policy of the secret data attached to the Secret. It cannot be changed
     * after the Secret has been created.
     * Structure is documented below.
     * 
     */
    @InputImport(name="replication")
      private final @Nullable Input<SecretReplicationGetArgs> replication;

    public Input<SecretReplicationGetArgs> getReplication() {
        return this.replication == null ? Input.empty() : this.replication;
    }

    /**
     * The rotation time and period for a Secret. At `next_rotation_time`, Secret Manager will send a Pub/Sub notification to the topics configured on the Secret. `topics` must be set to configure rotation.
     * Structure is documented below.
     * 
     */
    @InputImport(name="rotation")
      private final @Nullable Input<SecretRotationGetArgs> rotation;

    public Input<SecretRotationGetArgs> getRotation() {
        return this.rotation == null ? Input.empty() : this.rotation;
    }

    /**
     * This must be unique within the project.
     * 
     */
    @InputImport(name="secretId")
      private final @Nullable Input<String> secretId;

    public Input<String> getSecretId() {
        return this.secretId == null ? Input.empty() : this.secretId;
    }

    /**
     * A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     * Structure is documented below.
     * 
     */
    @InputImport(name="topics")
      private final @Nullable Input<List<SecretTopicGetArgs>> topics;

    public Input<List<SecretTopicGetArgs>> getTopics() {
        return this.topics == null ? Input.empty() : this.topics;
    }

    /**
     * The TTL for the Secret.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="ttl")
      private final @Nullable Input<String> ttl;

    public Input<String> getTtl() {
        return this.ttl == null ? Input.empty() : this.ttl;
    }

    public SecretState(
        @Nullable Input<String> createTime,
        @Nullable Input<String> expireTime,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<SecretReplicationGetArgs> replication,
        @Nullable Input<SecretRotationGetArgs> rotation,
        @Nullable Input<String> secretId,
        @Nullable Input<List<SecretTopicGetArgs>> topics,
        @Nullable Input<String> ttl) {
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.replication = replication;
        this.rotation = rotation;
        this.secretId = secretId;
        this.topics = topics;
        this.ttl = ttl;
    }

    private SecretState() {
        this.createTime = Input.empty();
        this.expireTime = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.replication = Input.empty();
        this.rotation = Input.empty();
        this.secretId = Input.empty();
        this.topics = Input.empty();
        this.ttl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> expireTime;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<SecretReplicationGetArgs> replication;
        private @Nullable Input<SecretRotationGetArgs> rotation;
        private @Nullable Input<String> secretId;
        private @Nullable Input<List<SecretTopicGetArgs>> topics;
        private @Nullable Input<String> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.replication = defaults.replication;
    	      this.rotation = defaults.rotation;
    	      this.secretId = defaults.secretId;
    	      this.topics = defaults.topics;
    	      this.ttl = defaults.ttl;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setExpireTime(@Nullable Input<String> expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        public Builder setExpireTime(@Nullable String expireTime) {
            this.expireTime = Input.ofNullable(expireTime);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setReplication(@Nullable Input<SecretReplicationGetArgs> replication) {
            this.replication = replication;
            return this;
        }

        public Builder setReplication(@Nullable SecretReplicationGetArgs replication) {
            this.replication = Input.ofNullable(replication);
            return this;
        }

        public Builder setRotation(@Nullable Input<SecretRotationGetArgs> rotation) {
            this.rotation = rotation;
            return this;
        }

        public Builder setRotation(@Nullable SecretRotationGetArgs rotation) {
            this.rotation = Input.ofNullable(rotation);
            return this;
        }

        public Builder setSecretId(@Nullable Input<String> secretId) {
            this.secretId = secretId;
            return this;
        }

        public Builder setSecretId(@Nullable String secretId) {
            this.secretId = Input.ofNullable(secretId);
            return this;
        }

        public Builder setTopics(@Nullable Input<List<SecretTopicGetArgs>> topics) {
            this.topics = topics;
            return this;
        }

        public Builder setTopics(@Nullable List<SecretTopicGetArgs> topics) {
            this.topics = Input.ofNullable(topics);
            return this;
        }

        public Builder setTtl(@Nullable Input<String> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder setTtl(@Nullable String ttl) {
            this.ttl = Input.ofNullable(ttl);
            return this;
        }
        public SecretState build() {
            return new SecretState(createTime, expireTime, labels, name, project, replication, rotation, secretId, topics, ttl);
        }
    }
}