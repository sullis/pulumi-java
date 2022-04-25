// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The status of a blueprint assignment. This field is readonly.
 * 
 */
public final class AssignmentStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final AssignmentStatusResponse Empty = new AssignmentStatusResponse();

    /**
     * Last modified time of this blueprint definition.
     * 
     */
    @Import(name="lastModified", required=true)
    private String lastModified;

    /**
     * @return Last modified time of this blueprint definition.
     * 
     */
    public String lastModified() {
        return this.lastModified;
    }

    /**
     * List of resources that were created by the blueprint assignment.
     * 
     */
    @Import(name="managedResources", required=true)
    private List<String> managedResources;

    /**
     * @return List of resources that were created by the blueprint assignment.
     * 
     */
    public List<String> managedResources() {
        return this.managedResources;
    }

    /**
     * Creation time of this blueprint definition.
     * 
     */
    @Import(name="timeCreated", required=true)
    private String timeCreated;

    /**
     * @return Creation time of this blueprint definition.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    private AssignmentStatusResponse() {}

    private AssignmentStatusResponse(AssignmentStatusResponse $) {
        this.lastModified = $.lastModified;
        this.managedResources = $.managedResources;
        this.timeCreated = $.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssignmentStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssignmentStatusResponse $;

        public Builder() {
            $ = new AssignmentStatusResponse();
        }

        public Builder(AssignmentStatusResponse defaults) {
            $ = new AssignmentStatusResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastModified Last modified time of this blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder lastModified(String lastModified) {
            $.lastModified = lastModified;
            return this;
        }

        /**
         * @param managedResources List of resources that were created by the blueprint assignment.
         * 
         * @return builder
         * 
         */
        public Builder managedResources(List<String> managedResources) {
            $.managedResources = managedResources;
            return this;
        }

        /**
         * @param managedResources List of resources that were created by the blueprint assignment.
         * 
         * @return builder
         * 
         */
        public Builder managedResources(String... managedResources) {
            return managedResources(List.of(managedResources));
        }

        /**
         * @param timeCreated Creation time of this blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        public AssignmentStatusResponse build() {
            $.lastModified = Objects.requireNonNull($.lastModified, "expected parameter 'lastModified' to be non-null");
            $.managedResources = Objects.requireNonNull($.managedResources, "expected parameter 'managedResources' to be non-null");
            $.timeCreated = Objects.requireNonNull($.timeCreated, "expected parameter 'timeCreated' to be non-null");
            return $;
        }
    }

}
