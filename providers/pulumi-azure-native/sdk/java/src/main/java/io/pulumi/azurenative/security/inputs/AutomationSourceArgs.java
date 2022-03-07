// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.enums.EventSource;
import io.pulumi.azurenative.security.inputs.AutomationRuleSetArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="eventSource")
      private final @Nullable Input<Either<String,EventSource>> eventSource;

    public Input<Either<String,EventSource>> getEventSource() {
        return this.eventSource == null ? Input.empty() : this.eventSource;
    }

    /**
     * A set of rules which evaluate upon event interception. A logical disjunction is applied between defined rule sets (logical 'or').
     * 
     */
    @InputImport(name="ruleSets")
      private final @Nullable Input<List<AutomationRuleSetArgs>> ruleSets;

    public Input<List<AutomationRuleSetArgs>> getRuleSets() {
        return this.ruleSets == null ? Input.empty() : this.ruleSets;
    }

    public AutomationSourceArgs(
        @Nullable Input<Either<String,EventSource>> eventSource,
        @Nullable Input<List<AutomationRuleSetArgs>> ruleSets) {
        this.eventSource = eventSource;
        this.ruleSets = ruleSets;
    }

    private AutomationSourceArgs() {
        this.eventSource = Input.empty();
        this.ruleSets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,EventSource>> eventSource;
        private @Nullable Input<List<AutomationRuleSetArgs>> ruleSets;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventSource = defaults.eventSource;
    	      this.ruleSets = defaults.ruleSets;
        }

        public Builder setEventSource(@Nullable Input<Either<String,EventSource>> eventSource) {
            this.eventSource = eventSource;
            return this;
        }

        public Builder setEventSource(@Nullable Either<String,EventSource> eventSource) {
            this.eventSource = Input.ofNullable(eventSource);
            return this;
        }

        public Builder setRuleSets(@Nullable Input<List<AutomationRuleSetArgs>> ruleSets) {
            this.ruleSets = ruleSets;
            return this;
        }

        public Builder setRuleSets(@Nullable List<AutomationRuleSetArgs> ruleSets) {
            this.ruleSets = Input.ofNullable(ruleSets);
            return this;
        }
        public AutomationSourceArgs build() {
            return new AutomationSourceArgs(eventSource, ruleSets);
        }
    }
}