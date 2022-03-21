// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.enums.EventSource;
import io.pulumi.azurenative.security.inputs.AutomationRuleSetArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The source event types which evaluate the security automation set of rules. For example - security alerts and security assessments. To learn more about the supported security events data models schemas - please visit https://aka.ms/ASCAutomationSchemas.
 * 
 */
public final class AutomationSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomationSourceArgs Empty = new AutomationSourceArgs();

    /**
     * A valid event source type.
     * 
     */
    @Import(name="eventSource")
      private final @Nullable Output<Either<String,EventSource>> eventSource;

    public Output<Either<String,EventSource>> getEventSource() {
        return this.eventSource == null ? Output.empty() : this.eventSource;
    }

    /**
     * A set of rules which evaluate upon event interception. A logical disjunction is applied between defined rule sets (logical 'or').
     * 
     */
    @Import(name="ruleSets")
      private final @Nullable Output<List<AutomationRuleSetArgs>> ruleSets;

    public Output<List<AutomationRuleSetArgs>> getRuleSets() {
        return this.ruleSets == null ? Output.empty() : this.ruleSets;
    }

    public AutomationSourceArgs(
        @Nullable Output<Either<String,EventSource>> eventSource,
        @Nullable Output<List<AutomationRuleSetArgs>> ruleSets) {
        this.eventSource = eventSource;
        this.ruleSets = ruleSets;
    }

    private AutomationSourceArgs() {
        this.eventSource = Output.empty();
        this.ruleSets = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,EventSource>> eventSource;
        private @Nullable Output<List<AutomationRuleSetArgs>> ruleSets;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventSource = defaults.eventSource;
    	      this.ruleSets = defaults.ruleSets;
        }

        public Builder eventSource(@Nullable Output<Either<String,EventSource>> eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public Builder eventSource(@Nullable Either<String,EventSource> eventSource) {
            this.eventSource = Output.ofNullable(eventSource);
            return this;
        }
        public Builder ruleSets(@Nullable Output<List<AutomationRuleSetArgs>> ruleSets) {
            this.ruleSets = ruleSets;
            return this;
        }
        public Builder ruleSets(@Nullable List<AutomationRuleSetArgs> ruleSets) {
            this.ruleSets = Output.ofNullable(ruleSets);
            return this;
        }
        public Builder ruleSets(AutomationRuleSetArgs... ruleSets) {
            return ruleSets(List.of(ruleSets));
        }        public AutomationSourceArgs build() {
            return new AutomationSourceArgs(eventSource, ruleSets);
        }
    }
}
