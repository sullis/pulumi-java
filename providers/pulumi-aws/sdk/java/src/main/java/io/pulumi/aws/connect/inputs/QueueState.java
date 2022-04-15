// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.aws.connect.inputs.QueueOutboundCallerConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueState extends io.pulumi.resources.ResourceArgs {

    public static final QueueState Empty = new QueueState();

    /**
     * The Amazon Resource Name (ARN) of the Queue.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Specifies the description of the Queue.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Specifies the identifier of the Hours of Operation.
     * 
     */
    @Import(name="hoursOfOperationId")
      private final @Nullable Output<String> hoursOfOperationId;

    public Output<String> hoursOfOperationId() {
        return this.hoursOfOperationId == null ? Codegen.empty() : this.hoursOfOperationId;
    }

    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Import(name="instanceId")
      private final @Nullable Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId == null ? Codegen.empty() : this.instanceId;
    }

    /**
     * Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
     * 
     */
    @Import(name="maxContacts")
      private final @Nullable Output<Integer> maxContacts;

    public Output<Integer> maxContacts() {
        return this.maxContacts == null ? Codegen.empty() : this.maxContacts;
    }

    /**
     * Specifies the name of the Queue.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
     * 
     */
    @Import(name="outboundCallerConfig")
      private final @Nullable Output<QueueOutboundCallerConfigGetArgs> outboundCallerConfig;

    public Output<QueueOutboundCallerConfigGetArgs> outboundCallerConfig() {
        return this.outboundCallerConfig == null ? Codegen.empty() : this.outboundCallerConfig;
    }

    /**
     * The identifier for the Queue.
     * 
     */
    @Import(name="queueId")
      private final @Nullable Output<String> queueId;

    public Output<String> queueId() {
        return this.queueId == null ? Codegen.empty() : this.queueId;
    }

    /**
     * Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
     * 
     */
    @Import(name="quickConnectIds")
      private final @Nullable Output<List<String>> quickConnectIds;

    public Output<List<String>> quickConnectIds() {
        return this.quickConnectIds == null ? Codegen.empty() : this.quickConnectIds;
    }

    /**
     * Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * Tags to apply to the Queue. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public QueueState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<String> hoursOfOperationId,
        @Nullable Output<String> instanceId,
        @Nullable Output<Integer> maxContacts,
        @Nullable Output<String> name,
        @Nullable Output<QueueOutboundCallerConfigGetArgs> outboundCallerConfig,
        @Nullable Output<String> queueId,
        @Nullable Output<List<String>> quickConnectIds,
        @Nullable Output<String> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.hoursOfOperationId = hoursOfOperationId;
        this.instanceId = instanceId;
        this.maxContacts = maxContacts;
        this.name = name;
        this.outboundCallerConfig = outboundCallerConfig;
        this.queueId = queueId;
        this.quickConnectIds = quickConnectIds;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private QueueState() {
        this.arn = Codegen.empty();
        this.description = Codegen.empty();
        this.hoursOfOperationId = Codegen.empty();
        this.instanceId = Codegen.empty();
        this.maxContacts = Codegen.empty();
        this.name = Codegen.empty();
        this.outboundCallerConfig = Codegen.empty();
        this.queueId = Codegen.empty();
        this.quickConnectIds = Codegen.empty();
        this.status = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<String> hoursOfOperationId;
        private @Nullable Output<String> instanceId;
        private @Nullable Output<Integer> maxContacts;
        private @Nullable Output<String> name;
        private @Nullable Output<QueueOutboundCallerConfigGetArgs> outboundCallerConfig;
        private @Nullable Output<String> queueId;
        private @Nullable Output<List<String>> quickConnectIds;
        private @Nullable Output<String> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.hoursOfOperationId = defaults.hoursOfOperationId;
    	      this.instanceId = defaults.instanceId;
    	      this.maxContacts = defaults.maxContacts;
    	      this.name = defaults.name;
    	      this.outboundCallerConfig = defaults.outboundCallerConfig;
    	      this.queueId = defaults.queueId;
    	      this.quickConnectIds = defaults.quickConnectIds;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder hoursOfOperationId(@Nullable Output<String> hoursOfOperationId) {
            this.hoursOfOperationId = hoursOfOperationId;
            return this;
        }
        public Builder hoursOfOperationId(@Nullable String hoursOfOperationId) {
            this.hoursOfOperationId = Codegen.ofNullable(hoursOfOperationId);
            return this;
        }
        public Builder instanceId(@Nullable Output<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = Codegen.ofNullable(instanceId);
            return this;
        }
        public Builder maxContacts(@Nullable Output<Integer> maxContacts) {
            this.maxContacts = maxContacts;
            return this;
        }
        public Builder maxContacts(@Nullable Integer maxContacts) {
            this.maxContacts = Codegen.ofNullable(maxContacts);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder outboundCallerConfig(@Nullable Output<QueueOutboundCallerConfigGetArgs> outboundCallerConfig) {
            this.outboundCallerConfig = outboundCallerConfig;
            return this;
        }
        public Builder outboundCallerConfig(@Nullable QueueOutboundCallerConfigGetArgs outboundCallerConfig) {
            this.outboundCallerConfig = Codegen.ofNullable(outboundCallerConfig);
            return this;
        }
        public Builder queueId(@Nullable Output<String> queueId) {
            this.queueId = queueId;
            return this;
        }
        public Builder queueId(@Nullable String queueId) {
            this.queueId = Codegen.ofNullable(queueId);
            return this;
        }
        public Builder quickConnectIds(@Nullable Output<List<String>> quickConnectIds) {
            this.quickConnectIds = quickConnectIds;
            return this;
        }
        public Builder quickConnectIds(@Nullable List<String> quickConnectIds) {
            this.quickConnectIds = Codegen.ofNullable(quickConnectIds);
            return this;
        }
        public Builder quickConnectIds(String... quickConnectIds) {
            return quickConnectIds(List.of(quickConnectIds));
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public QueueState build() {
            return new QueueState(arn, description, hoursOfOperationId, instanceId, maxContacts, name, outboundCallerConfig, queueId, quickConnectIds, status, tags, tagsAll);
        }
    }
}
