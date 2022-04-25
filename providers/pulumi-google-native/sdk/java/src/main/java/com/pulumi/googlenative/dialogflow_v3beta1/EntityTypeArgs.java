// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.enums.EntityTypeAutoExpansionMode;
import com.pulumi.googlenative.dialogflow_v3beta1.enums.EntityTypeKind;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1EntityTypeEntityArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntityTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final EntityTypeArgs Empty = new EntityTypeArgs();

    @Import(name="agentId", required=true)
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }

    /**
     * Indicates whether the entity type can be automatically expanded.
     * 
     */
    @Import(name="autoExpansionMode")
    private @Nullable Output<EntityTypeAutoExpansionMode> autoExpansionMode;

    /**
     * @return Indicates whether the entity type can be automatically expanded.
     * 
     */
    public Optional<Output<EntityTypeAutoExpansionMode>> autoExpansionMode() {
        return Optional.ofNullable(this.autoExpansionMode);
    }

    /**
     * The human-readable name of the entity type, unique within the agent.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The human-readable name of the entity type, unique within the agent.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Enables fuzzy entity extraction during classification.
     * 
     */
    @Import(name="enableFuzzyExtraction")
    private @Nullable Output<Boolean> enableFuzzyExtraction;

    /**
     * @return Enables fuzzy entity extraction during classification.
     * 
     */
    public Optional<Output<Boolean>> enableFuzzyExtraction() {
        return Optional.ofNullable(this.enableFuzzyExtraction);
    }

    /**
     * The collection of entity entries associated with the entity type.
     * 
     */
    @Import(name="entities")
    private @Nullable Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityArgs>> entities;

    /**
     * @return The collection of entity entries associated with the entity type.
     * 
     */
    public Optional<Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityArgs>>> entities() {
        return Optional.ofNullable(this.entities);
    }

    /**
     * Collection of exceptional words and phrases that shouldn&#39;t be matched. For example, if you have a size entity type with entry `giant`(an adjective), you might consider adding `giants`(a noun) as an exclusion. If the kind of entity type is `KIND_MAP`, then the phrases specified by entities and excluded phrases should be mutually exclusive.
     * 
     */
    @Import(name="excludedPhrases")
    private @Nullable Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseArgs>> excludedPhrases;

    /**
     * @return Collection of exceptional words and phrases that shouldn&#39;t be matched. For example, if you have a size entity type with entry `giant`(an adjective), you might consider adding `giants`(a noun) as an exclusion. If the kind of entity type is `KIND_MAP`, then the phrases specified by entities and excluded phrases should be mutually exclusive.
     * 
     */
    public Optional<Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseArgs>>> excludedPhrases() {
        return Optional.ofNullable(this.excludedPhrases);
    }

    /**
     * Indicates the kind of entity type.
     * 
     */
    @Import(name="kind", required=true)
    private Output<EntityTypeKind> kind;

    /**
     * @return Indicates the kind of entity type.
     * 
     */
    public Output<EntityTypeKind> kind() {
        return this.kind;
    }

    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType. Format: `projects//locations//agents//entityTypes/`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType. Format: `projects//locations//agents//entityTypes/`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Indicates whether parameters of the entity type should be redacted in log. If redaction is enabled, page parameters and intent parameters referring to the entity type will be replaced by parameter name during logging.
     * 
     */
    @Import(name="redact")
    private @Nullable Output<Boolean> redact;

    /**
     * @return Indicates whether parameters of the entity type should be redacted in log. If redaction is enabled, page parameters and intent parameters referring to the entity type will be replaced by parameter name during logging.
     * 
     */
    public Optional<Output<Boolean>> redact() {
        return Optional.ofNullable(this.redact);
    }

    private EntityTypeArgs() {}

    private EntityTypeArgs(EntityTypeArgs $) {
        this.agentId = $.agentId;
        this.autoExpansionMode = $.autoExpansionMode;
        this.displayName = $.displayName;
        this.enableFuzzyExtraction = $.enableFuzzyExtraction;
        this.entities = $.entities;
        this.excludedPhrases = $.excludedPhrases;
        this.kind = $.kind;
        this.languageCode = $.languageCode;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.redact = $.redact;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntityTypeArgs $;

        public Builder() {
            $ = new EntityTypeArgs();
        }

        public Builder(EntityTypeArgs defaults) {
            $ = new EntityTypeArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        /**
         * @param autoExpansionMode Indicates whether the entity type can be automatically expanded.
         * 
         * @return builder
         * 
         */
        public Builder autoExpansionMode(@Nullable Output<EntityTypeAutoExpansionMode> autoExpansionMode) {
            $.autoExpansionMode = autoExpansionMode;
            return this;
        }

        /**
         * @param autoExpansionMode Indicates whether the entity type can be automatically expanded.
         * 
         * @return builder
         * 
         */
        public Builder autoExpansionMode(EntityTypeAutoExpansionMode autoExpansionMode) {
            return autoExpansionMode(Output.of(autoExpansionMode));
        }

        /**
         * @param displayName The human-readable name of the entity type, unique within the agent.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The human-readable name of the entity type, unique within the agent.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enableFuzzyExtraction Enables fuzzy entity extraction during classification.
         * 
         * @return builder
         * 
         */
        public Builder enableFuzzyExtraction(@Nullable Output<Boolean> enableFuzzyExtraction) {
            $.enableFuzzyExtraction = enableFuzzyExtraction;
            return this;
        }

        /**
         * @param enableFuzzyExtraction Enables fuzzy entity extraction during classification.
         * 
         * @return builder
         * 
         */
        public Builder enableFuzzyExtraction(Boolean enableFuzzyExtraction) {
            return enableFuzzyExtraction(Output.of(enableFuzzyExtraction));
        }

        /**
         * @param entities The collection of entity entries associated with the entity type.
         * 
         * @return builder
         * 
         */
        public Builder entities(@Nullable Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityArgs>> entities) {
            $.entities = entities;
            return this;
        }

        /**
         * @param entities The collection of entity entries associated with the entity type.
         * 
         * @return builder
         * 
         */
        public Builder entities(List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityArgs> entities) {
            return entities(Output.of(entities));
        }

        /**
         * @param entities The collection of entity entries associated with the entity type.
         * 
         * @return builder
         * 
         */
        public Builder entities(GoogleCloudDialogflowCxV3beta1EntityTypeEntityArgs... entities) {
            return entities(List.of(entities));
        }

        /**
         * @param excludedPhrases Collection of exceptional words and phrases that shouldn&#39;t be matched. For example, if you have a size entity type with entry `giant`(an adjective), you might consider adding `giants`(a noun) as an exclusion. If the kind of entity type is `KIND_MAP`, then the phrases specified by entities and excluded phrases should be mutually exclusive.
         * 
         * @return builder
         * 
         */
        public Builder excludedPhrases(@Nullable Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseArgs>> excludedPhrases) {
            $.excludedPhrases = excludedPhrases;
            return this;
        }

        /**
         * @param excludedPhrases Collection of exceptional words and phrases that shouldn&#39;t be matched. For example, if you have a size entity type with entry `giant`(an adjective), you might consider adding `giants`(a noun) as an exclusion. If the kind of entity type is `KIND_MAP`, then the phrases specified by entities and excluded phrases should be mutually exclusive.
         * 
         * @return builder
         * 
         */
        public Builder excludedPhrases(List<GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseArgs> excludedPhrases) {
            return excludedPhrases(Output.of(excludedPhrases));
        }

        /**
         * @param excludedPhrases Collection of exceptional words and phrases that shouldn&#39;t be matched. For example, if you have a size entity type with entry `giant`(an adjective), you might consider adding `giants`(a noun) as an exclusion. If the kind of entity type is `KIND_MAP`, then the phrases specified by entities and excluded phrases should be mutually exclusive.
         * 
         * @return builder
         * 
         */
        public Builder excludedPhrases(GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseArgs... excludedPhrases) {
            return excludedPhrases(List.of(excludedPhrases));
        }

        /**
         * @param kind Indicates the kind of entity type.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<EntityTypeKind> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Indicates the kind of entity type.
         * 
         * @return builder
         * 
         */
        public Builder kind(EntityTypeKind kind) {
            return kind(Output.of(kind));
        }

        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType. Format: `projects//locations//agents//entityTypes/`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType. Format: `projects//locations//agents//entityTypes/`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param redact Indicates whether parameters of the entity type should be redacted in log. If redaction is enabled, page parameters and intent parameters referring to the entity type will be replaced by parameter name during logging.
         * 
         * @return builder
         * 
         */
        public Builder redact(@Nullable Output<Boolean> redact) {
            $.redact = redact;
            return this;
        }

        /**
         * @param redact Indicates whether parameters of the entity type should be redacted in log. If redaction is enabled, page parameters and intent parameters referring to the entity type will be replaced by parameter name during logging.
         * 
         * @return builder
         * 
         */
        public Builder redact(Boolean redact) {
            return redact(Output.of(redact));
        }

        public EntityTypeArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            return $;
        }
    }

}
