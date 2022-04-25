// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecr.inputs;

import com.pulumi.awsnative.ecr.inputs.ReplicationConfigurationReplicationDestination;
import com.pulumi.awsnative.ecr.inputs.ReplicationConfigurationRepositoryFilter;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An array of objects representing the details of a replication destination.
 * 
 */
public final class ReplicationConfigurationReplicationRule extends com.pulumi.resources.InvokeArgs {

    public static final ReplicationConfigurationReplicationRule Empty = new ReplicationConfigurationReplicationRule();

    /**
     * An array of objects representing the details of a replication destination.
     * 
     */
    @Import(name="destinations", required=true)
    private List<ReplicationConfigurationReplicationDestination> destinations;

    /**
     * @return An array of objects representing the details of a replication destination.
     * 
     */
    public List<ReplicationConfigurationReplicationDestination> destinations() {
        return this.destinations;
    }

    /**
     * An array of objects representing the details of a repository filter.
     * 
     */
    @Import(name="repositoryFilters")
    private @Nullable List<ReplicationConfigurationRepositoryFilter> repositoryFilters;

    /**
     * @return An array of objects representing the details of a repository filter.
     * 
     */
    public Optional<List<ReplicationConfigurationRepositoryFilter>> repositoryFilters() {
        return Optional.ofNullable(this.repositoryFilters);
    }

    private ReplicationConfigurationReplicationRule() {}

    private ReplicationConfigurationReplicationRule(ReplicationConfigurationReplicationRule $) {
        this.destinations = $.destinations;
        this.repositoryFilters = $.repositoryFilters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationConfigurationReplicationRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationConfigurationReplicationRule $;

        public Builder() {
            $ = new ReplicationConfigurationReplicationRule();
        }

        public Builder(ReplicationConfigurationReplicationRule defaults) {
            $ = new ReplicationConfigurationReplicationRule(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinations An array of objects representing the details of a replication destination.
         * 
         * @return builder
         * 
         */
        public Builder destinations(List<ReplicationConfigurationReplicationDestination> destinations) {
            $.destinations = destinations;
            return this;
        }

        /**
         * @param destinations An array of objects representing the details of a replication destination.
         * 
         * @return builder
         * 
         */
        public Builder destinations(ReplicationConfigurationReplicationDestination... destinations) {
            return destinations(List.of(destinations));
        }

        /**
         * @param repositoryFilters An array of objects representing the details of a repository filter.
         * 
         * @return builder
         * 
         */
        public Builder repositoryFilters(@Nullable List<ReplicationConfigurationRepositoryFilter> repositoryFilters) {
            $.repositoryFilters = repositoryFilters;
            return this;
        }

        /**
         * @param repositoryFilters An array of objects representing the details of a repository filter.
         * 
         * @return builder
         * 
         */
        public Builder repositoryFilters(ReplicationConfigurationRepositoryFilter... repositoryFilters) {
            return repositoryFilters(List.of(repositoryFilters));
        }

        public ReplicationConfigurationReplicationRule build() {
            $.destinations = Objects.requireNonNull($.destinations, "expected parameter 'destinations' to be non-null");
            return $;
        }
    }

}
