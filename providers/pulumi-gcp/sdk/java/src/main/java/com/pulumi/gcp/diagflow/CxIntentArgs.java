// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxIntentParameterArgs;
import com.pulumi.gcp.diagflow.inputs.CxIntentTrainingPhraseArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxIntentArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxIntentArgs Empty = new CxIntentArgs();

    /**
     * Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The human-readable name of the intent, unique within the agent.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The human-readable name of the intent, unique within the agent.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation.
     * Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    @Import(name="isFallback")
    private @Nullable Output<Boolean> isFallback;

    /**
     * @return Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation.
     * Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    public Optional<Output<Boolean>> isFallback() {
        return Optional.ofNullable(this.isFallback);
    }

    /**
     * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols &#39;-&#39; and &#39;_&#39;. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes.
     * Prefix &#34;sys-&#34; is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. &#34;sys-head&#34; means the intent is a head intent. &#34;sys.contextual&#34; means the intent is a contextual intent.
     * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols &#39;-&#39; and &#39;_&#39;. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes.
     * Prefix &#34;sys-&#34; is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. &#34;sys-head&#34; means the intent is a head intent. &#34;sys.contextual&#34; means the intent is a contextual intent.
     * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The language of the following fields in intent:
     * Intent.training_phrases.parts.text
     * If not specified, the agent&#39;s default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    /**
     * @return The language of the following fields in intent:
     * Intent.training_phrases.parts.text
     * If not specified, the agent&#39;s default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    /**
     * The collection of parameters associated with the intent.
     * Structure is documented below.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<CxIntentParameterArgs>> parameters;

    /**
     * @return The collection of parameters associated with the intent.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CxIntentParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The agent to create an intent for.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The agent to create an intent for.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * The priority of this intent. Higher numbers represent higher priorities.
     * If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the Normal priority in the console.
     * If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of this intent. Higher numbers represent higher priorities.
     * If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the Normal priority in the console.
     * If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The collection of training phrases the agent is trained on to identify the intent.
     * Structure is documented below.
     * 
     */
    @Import(name="trainingPhrases")
    private @Nullable Output<List<CxIntentTrainingPhraseArgs>> trainingPhrases;

    /**
     * @return The collection of training phrases the agent is trained on to identify the intent.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CxIntentTrainingPhraseArgs>>> trainingPhrases() {
        return Optional.ofNullable(this.trainingPhrases);
    }

    private CxIntentArgs() {}

    private CxIntentArgs(CxIntentArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.isFallback = $.isFallback;
        this.labels = $.labels;
        this.languageCode = $.languageCode;
        this.parameters = $.parameters;
        this.parent = $.parent;
        this.priority = $.priority;
        this.trainingPhrases = $.trainingPhrases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxIntentArgs $;

        public Builder() {
            $ = new CxIntentArgs();
        }

        public Builder(CxIntentArgs defaults) {
            $ = new CxIntentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The human-readable name of the intent, unique within the agent.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The human-readable name of the intent, unique within the agent.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param isFallback Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation.
         * Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
         * 
         * @return builder
         * 
         */
        public Builder isFallback(@Nullable Output<Boolean> isFallback) {
            $.isFallback = isFallback;
            return this;
        }

        /**
         * @param isFallback Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation.
         * Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
         * 
         * @return builder
         * 
         */
        public Builder isFallback(Boolean isFallback) {
            return isFallback(Output.of(isFallback));
        }

        /**
         * @param labels The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols &#39;-&#39; and &#39;_&#39;. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes.
         * Prefix &#34;sys-&#34; is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. &#34;sys-head&#34; means the intent is a head intent. &#34;sys.contextual&#34; means the intent is a contextual intent.
         * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols &#39;-&#39; and &#39;_&#39;. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes.
         * Prefix &#34;sys-&#34; is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. &#34;sys-head&#34; means the intent is a head intent. &#34;sys.contextual&#34; means the intent is a contextual intent.
         * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param languageCode The language of the following fields in intent:
         * Intent.training_phrases.parts.text
         * If not specified, the agent&#39;s default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode The language of the following fields in intent:
         * Intent.training_phrases.parts.text
         * If not specified, the agent&#39;s default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        /**
         * @param parameters The collection of parameters associated with the intent.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<CxIntentParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The collection of parameters associated with the intent.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<CxIntentParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters The collection of parameters associated with the intent.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder parameters(CxIntentParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param parent The agent to create an intent for.
         * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The agent to create an intent for.
         * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param priority The priority of this intent. Higher numbers represent higher priorities.
         * If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the Normal priority in the console.
         * If the supplied value is negative, the intent is ignored in runtime detect intent requests.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of this intent. Higher numbers represent higher priorities.
         * If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the Normal priority in the console.
         * If the supplied value is negative, the intent is ignored in runtime detect intent requests.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param trainingPhrases The collection of training phrases the agent is trained on to identify the intent.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder trainingPhrases(@Nullable Output<List<CxIntentTrainingPhraseArgs>> trainingPhrases) {
            $.trainingPhrases = trainingPhrases;
            return this;
        }

        /**
         * @param trainingPhrases The collection of training phrases the agent is trained on to identify the intent.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder trainingPhrases(List<CxIntentTrainingPhraseArgs> trainingPhrases) {
            return trainingPhrases(Output.of(trainingPhrases));
        }

        /**
         * @param trainingPhrases The collection of training phrases the agent is trained on to identify the intent.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder trainingPhrases(CxIntentTrainingPhraseArgs... trainingPhrases) {
            return trainingPhrases(List.of(trainingPhrases));
        }

        public CxIntentArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}
