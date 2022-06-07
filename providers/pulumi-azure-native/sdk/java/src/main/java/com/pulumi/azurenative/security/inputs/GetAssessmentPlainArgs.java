// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAssessmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssessmentPlainArgs Empty = new GetAssessmentPlainArgs();

    /**
     * The Assessment Key - Unique key for the assessment type
     * 
     */
    @Import(name="assessmentName", required=true)
    private String assessmentName;

    /**
     * @return The Assessment Key - Unique key for the assessment type
     * 
     */
    public String assessmentName() {
        return this.assessmentName;
    }

    /**
     * OData expand. Optional.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return OData expand. Optional.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The identifier of the resource.
     * 
     */
    @Import(name="resourceId", required=true)
    private String resourceId;

    /**
     * @return The identifier of the resource.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }

    private GetAssessmentPlainArgs() {}

    private GetAssessmentPlainArgs(GetAssessmentPlainArgs $) {
        this.assessmentName = $.assessmentName;
        this.expand = $.expand;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAssessmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAssessmentPlainArgs $;

        public Builder() {
            $ = new GetAssessmentPlainArgs();
        }

        public Builder(GetAssessmentPlainArgs defaults) {
            $ = new GetAssessmentPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assessmentName The Assessment Key - Unique key for the assessment type
         * 
         * @return builder
         * 
         */
        public Builder assessmentName(String assessmentName) {
            $.assessmentName = assessmentName;
            return this;
        }

        /**
         * @param expand OData expand. Optional.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param resourceId The identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public GetAssessmentPlainArgs build() {
            $.assessmentName = Objects.requireNonNull($.assessmentName, "expected parameter 'assessmentName' to be non-null");
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}
