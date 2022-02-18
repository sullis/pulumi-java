// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionOriginGroupFailoverCriteriaArgs;
import io.pulumi.awsnative.cloudfront.inputs.DistributionOriginGroupMembersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DistributionOriginGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginGroupArgs Empty = new DistributionOriginGroupArgs();

    @InputImport(name="failoverCriteria", required=true)
    private final Input<DistributionOriginGroupFailoverCriteriaArgs> failoverCriteria;

    public Input<DistributionOriginGroupFailoverCriteriaArgs> getFailoverCriteria() {
        return this.failoverCriteria;
    }

    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    @InputImport(name="members", required=true)
    private final Input<DistributionOriginGroupMembersArgs> members;

    public Input<DistributionOriginGroupMembersArgs> getMembers() {
        return this.members;
    }

    public DistributionOriginGroupArgs(
        Input<DistributionOriginGroupFailoverCriteriaArgs> failoverCriteria,
        Input<String> id,
        Input<DistributionOriginGroupMembersArgs> members) {
        this.failoverCriteria = Objects.requireNonNull(failoverCriteria, "expected parameter 'failoverCriteria' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
    }

    private DistributionOriginGroupArgs() {
        this.failoverCriteria = Input.empty();
        this.id = Input.empty();
        this.members = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DistributionOriginGroupFailoverCriteriaArgs> failoverCriteria;
        private Input<String> id;
        private Input<DistributionOriginGroupMembersArgs> members;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverCriteria = defaults.failoverCriteria;
    	      this.id = defaults.id;
    	      this.members = defaults.members;
        }

        public Builder setFailoverCriteria(Input<DistributionOriginGroupFailoverCriteriaArgs> failoverCriteria) {
            this.failoverCriteria = Objects.requireNonNull(failoverCriteria);
            return this;
        }

        public Builder setFailoverCriteria(DistributionOriginGroupFailoverCriteriaArgs failoverCriteria) {
            this.failoverCriteria = Input.of(Objects.requireNonNull(failoverCriteria));
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

        public Builder setMembers(Input<DistributionOriginGroupMembersArgs> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(DistributionOriginGroupMembersArgs members) {
            this.members = Input.of(Objects.requireNonNull(members));
            return this;
        }

        public DistributionOriginGroupArgs build() {
            return new DistributionOriginGroupArgs(failoverCriteria, id, members);
        }
    }
}
