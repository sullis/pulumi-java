// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.inputs;

import io.pulumi.awsnative.frauddetector.enums.DetectorRuleLanguage;
import io.pulumi.awsnative.frauddetector.inputs.DetectorOutcomeArgs;
import io.pulumi.awsnative.frauddetector.inputs.DetectorTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DetectorRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorRuleArgs Empty = new DetectorRuleArgs();

    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The time when the event type was created.
     * 
     */
    @Import(name="createdTime")
      private final @Nullable Output<String> createdTime;

    public Output<String> getCreatedTime() {
        return this.createdTime == null ? Output.empty() : this.createdTime;
    }

    /**
     * The description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="detectorId")
      private final @Nullable Output<String> detectorId;

    public Output<String> getDetectorId() {
        return this.detectorId == null ? Output.empty() : this.detectorId;
    }

    @Import(name="expression")
      private final @Nullable Output<String> expression;

    public Output<String> getExpression() {
        return this.expression == null ? Output.empty() : this.expression;
    }

    @Import(name="language")
      private final @Nullable Output<DetectorRuleLanguage> language;

    public Output<DetectorRuleLanguage> getLanguage() {
        return this.language == null ? Output.empty() : this.language;
    }

    /**
     * The time when the event type was last updated.
     * 
     */
    @Import(name="lastUpdatedTime")
      private final @Nullable Output<String> lastUpdatedTime;

    public Output<String> getLastUpdatedTime() {
        return this.lastUpdatedTime == null ? Output.empty() : this.lastUpdatedTime;
    }

    @Import(name="outcomes")
      private final @Nullable Output<List<DetectorOutcomeArgs>> outcomes;

    public Output<List<DetectorOutcomeArgs>> getOutcomes() {
        return this.outcomes == null ? Output.empty() : this.outcomes;
    }

    @Import(name="ruleId")
      private final @Nullable Output<String> ruleId;

    public Output<String> getRuleId() {
        return this.ruleId == null ? Output.empty() : this.ruleId;
    }

    @Import(name="ruleVersion")
      private final @Nullable Output<String> ruleVersion;

    public Output<String> getRuleVersion() {
        return this.ruleVersion == null ? Output.empty() : this.ruleVersion;
    }

    /**
     * Tags associated with this event type.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<DetectorTagArgs>> tags;

    public Output<List<DetectorTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public DetectorRuleArgs(
        @Nullable Output<String> arn,
        @Nullable Output<String> createdTime,
        @Nullable Output<String> description,
        @Nullable Output<String> detectorId,
        @Nullable Output<String> expression,
        @Nullable Output<DetectorRuleLanguage> language,
        @Nullable Output<String> lastUpdatedTime,
        @Nullable Output<List<DetectorOutcomeArgs>> outcomes,
        @Nullable Output<String> ruleId,
        @Nullable Output<String> ruleVersion,
        @Nullable Output<List<DetectorTagArgs>> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.detectorId = detectorId;
        this.expression = expression;
        this.language = language;
        this.lastUpdatedTime = lastUpdatedTime;
        this.outcomes = outcomes;
        this.ruleId = ruleId;
        this.ruleVersion = ruleVersion;
        this.tags = tags;
    }

    private DetectorRuleArgs() {
        this.arn = Output.empty();
        this.createdTime = Output.empty();
        this.description = Output.empty();
        this.detectorId = Output.empty();
        this.expression = Output.empty();
        this.language = Output.empty();
        this.lastUpdatedTime = Output.empty();
        this.outcomes = Output.empty();
        this.ruleId = Output.empty();
        this.ruleVersion = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> createdTime;
        private @Nullable Output<String> description;
        private @Nullable Output<String> detectorId;
        private @Nullable Output<String> expression;
        private @Nullable Output<DetectorRuleLanguage> language;
        private @Nullable Output<String> lastUpdatedTime;
        private @Nullable Output<List<DetectorOutcomeArgs>> outcomes;
        private @Nullable Output<String> ruleId;
        private @Nullable Output<String> ruleVersion;
        private @Nullable Output<List<DetectorTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.detectorId = defaults.detectorId;
    	      this.expression = defaults.expression;
    	      this.language = defaults.language;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.outcomes = defaults.outcomes;
    	      this.ruleId = defaults.ruleId;
    	      this.ruleVersion = defaults.ruleVersion;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder createdTime(@Nullable Output<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = Output.ofNullable(createdTime);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder detectorId(@Nullable Output<String> detectorId) {
            this.detectorId = detectorId;
            return this;
        }
        public Builder detectorId(@Nullable String detectorId) {
            this.detectorId = Output.ofNullable(detectorId);
            return this;
        }
        public Builder expression(@Nullable Output<String> expression) {
            this.expression = expression;
            return this;
        }
        public Builder expression(@Nullable String expression) {
            this.expression = Output.ofNullable(expression);
            return this;
        }
        public Builder language(@Nullable Output<DetectorRuleLanguage> language) {
            this.language = language;
            return this;
        }
        public Builder language(@Nullable DetectorRuleLanguage language) {
            this.language = Output.ofNullable(language);
            return this;
        }
        public Builder lastUpdatedTime(@Nullable Output<String> lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = Output.ofNullable(lastUpdatedTime);
            return this;
        }
        public Builder outcomes(@Nullable Output<List<DetectorOutcomeArgs>> outcomes) {
            this.outcomes = outcomes;
            return this;
        }
        public Builder outcomes(@Nullable List<DetectorOutcomeArgs> outcomes) {
            this.outcomes = Output.ofNullable(outcomes);
            return this;
        }
        public Builder outcomes(DetectorOutcomeArgs... outcomes) {
            return outcomes(List.of(outcomes));
        }
        public Builder ruleId(@Nullable Output<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Builder ruleId(@Nullable String ruleId) {
            this.ruleId = Output.ofNullable(ruleId);
            return this;
        }
        public Builder ruleVersion(@Nullable Output<String> ruleVersion) {
            this.ruleVersion = ruleVersion;
            return this;
        }
        public Builder ruleVersion(@Nullable String ruleVersion) {
            this.ruleVersion = Output.ofNullable(ruleVersion);
            return this;
        }
        public Builder tags(@Nullable Output<List<DetectorTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<DetectorTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(DetectorTagArgs... tags) {
            return tags(List.of(tags));
        }        public DetectorRuleArgs build() {
            return new DetectorRuleArgs(arn, createdTime, description, detectorId, expression, language, lastUpdatedTime, outcomes, ruleId, ruleVersion, tags);
        }
    }
}
