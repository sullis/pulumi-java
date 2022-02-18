// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleElasticsearchActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleElasticsearchActionArgs Empty = new TopicRuleElasticsearchActionArgs();

    @InputImport(name="endpoint", required=true)
    private final Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint;
    }

    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    @InputImport(name="index", required=true)
    private final Input<String> index;

    public Input<String> getIndex() {
        return this.index;
    }

    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public TopicRuleElasticsearchActionArgs(
        Input<String> endpoint,
        Input<String> id,
        Input<String> index,
        Input<String> roleArn,
        Input<String> type) {
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.index = Objects.requireNonNull(index, "expected parameter 'index' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TopicRuleElasticsearchActionArgs() {
        this.endpoint = Input.empty();
        this.id = Input.empty();
        this.index = Input.empty();
        this.roleArn = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleElasticsearchActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> endpoint;
        private Input<String> id;
        private Input<String> index;
        private Input<String> roleArn;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleElasticsearchActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.index = defaults.index;
    	      this.roleArn = defaults.roleArn;
    	      this.type = defaults.type;
        }

        public Builder setEndpoint(Input<String> endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Input.of(Objects.requireNonNull(endpoint));
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setIndex(Input<String> index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }

        public Builder setIndex(String index) {
            this.index = Input.of(Objects.requireNonNull(index));
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public TopicRuleElasticsearchActionArgs build() {
            return new TopicRuleElasticsearchActionArgs(endpoint, id, index, roleArn, type);
        }
    }
}
