// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContactFlowState extends io.pulumi.resources.ResourceArgs {

    public static final ContactFlowState Empty = new ContactFlowState();

    /**
     * The Amazon Resource Name (ARN) of the Contact Flow.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The identifier of the Contact Flow.
     * 
     */
    @InputImport(name="contactFlowId")
      private final @Nullable Input<String> contactFlowId;

    public Input<String> getContactFlowId() {
        return this.contactFlowId == null ? Input.empty() : this.contactFlowId;
    }

    /**
     * Specifies the content of the Contact Flow, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
     * 
     */
    @InputImport(name="content")
      private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    @InputImport(name="contentHash")
      private final @Nullable Input<String> contentHash;

    public Input<String> getContentHash() {
        return this.contentHash == null ? Input.empty() : this.contentHash;
    }

    /**
     * Specifies the description of the Contact Flow.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The path to the Contact Flow source within the local filesystem. Conflicts with `content`.
     * 
     */
    @InputImport(name="filename")
      private final @Nullable Input<String> filename;

    public Input<String> getFilename() {
        return this.filename == null ? Input.empty() : this.filename;
    }

    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @InputImport(name="instanceId")
      private final @Nullable Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId == null ? Input.empty() : this.instanceId;
    }

    /**
     * Specifies the name of the Contact Flow.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Tags to apply to the Contact Flow. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Specifies the type of the Contact Flow. Defaults to `CONTACT_FLOW`. Allowed Values are: `CONTACT_FLOW`, `CUSTOMER_QUEUE`, `CUSTOMER_HOLD`, `CUSTOMER_WHISPER`, `AGENT_HOLD`, `AGENT_WHISPER`, `OUTBOUND_WHISPER`, `AGENT_TRANSFER`, `QUEUE_TRANSFER`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ContactFlowState(
        @Nullable Input<String> arn,
        @Nullable Input<String> contactFlowId,
        @Nullable Input<String> content,
        @Nullable Input<String> contentHash,
        @Nullable Input<String> description,
        @Nullable Input<String> filename,
        @Nullable Input<String> instanceId,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> type) {
        this.arn = arn;
        this.contactFlowId = contactFlowId;
        this.content = content;
        this.contentHash = contentHash;
        this.description = description;
        this.filename = filename;
        this.instanceId = instanceId;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
    }

    private ContactFlowState() {
        this.arn = Input.empty();
        this.contactFlowId = Input.empty();
        this.content = Input.empty();
        this.contentHash = Input.empty();
        this.description = Input.empty();
        this.filename = Input.empty();
        this.instanceId = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactFlowState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> contactFlowId;
        private @Nullable Input<String> content;
        private @Nullable Input<String> contentHash;
        private @Nullable Input<String> description;
        private @Nullable Input<String> filename;
        private @Nullable Input<String> instanceId;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactFlowState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.contactFlowId = defaults.contactFlowId;
    	      this.content = defaults.content;
    	      this.contentHash = defaults.contentHash;
    	      this.description = defaults.description;
    	      this.filename = defaults.filename;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setContactFlowId(@Nullable Input<String> contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }

        public Builder setContactFlowId(@Nullable String contactFlowId) {
            this.contactFlowId = Input.ofNullable(contactFlowId);
            return this;
        }

        public Builder setContent(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder setContentHash(@Nullable Input<String> contentHash) {
            this.contentHash = contentHash;
            return this;
        }

        public Builder setContentHash(@Nullable String contentHash) {
            this.contentHash = Input.ofNullable(contentHash);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFilename(@Nullable Input<String> filename) {
            this.filename = filename;
            return this;
        }

        public Builder setFilename(@Nullable String filename) {
            this.filename = Input.ofNullable(filename);
            return this;
        }

        public Builder setInstanceId(@Nullable Input<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder setInstanceId(@Nullable String instanceId) {
            this.instanceId = Input.ofNullable(instanceId);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ContactFlowState build() {
            return new ContactFlowState(arn, contactFlowId, content, contentHash, description, filename, instanceId, name, tags, tagsAll, type);
        }
    }
}