// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecr.inputs;

import com.pulumi.awsnative.ecr.inputs.ReplicationConfigurationReplicationRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * An object representing the replication configuration for a registry.
 * 
 */
public final class ReplicationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationArgs Empty = new ReplicationConfigurationArgs();

    /**
     * An array of objects representing the replication rules for a replication configuration. A replication configuration may contain a maximum of 10 rules.
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<ReplicationConfigurationReplicationRuleArgs>> rules;

    /**
     * @return An array of objects representing the replication rules for a replication configuration. A replication configuration may contain a maximum of 10 rules.
     * 
     */
    public Output<List<ReplicationConfigurationReplicationRuleArgs>> rules() {
        return this.rules;
    }

    private ReplicationConfigurationArgs() {}

    private ReplicationConfigurationArgs(ReplicationConfigurationArgs $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationConfigurationArgs $;

        public Builder() {
            $ = new ReplicationConfigurationArgs();
        }

        public Builder(ReplicationConfigurationArgs defaults) {
            $ = new ReplicationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rules An array of objects representing the replication rules for a replication configuration. A replication configuration may contain a maximum of 10 rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<ReplicationConfigurationReplicationRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules An array of objects representing the replication rules for a replication configuration. A replication configuration may contain a maximum of 10 rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<ReplicationConfigurationReplicationRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules An array of objects representing the replication rules for a replication configuration. A replication configuration may contain a maximum of 10 rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(ReplicationConfigurationReplicationRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public ReplicationConfigurationArgs build() {
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
