// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.GlobalForwardingRuleMetadataFilterFilterLabelGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GlobalForwardingRuleMetadataFilterGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalForwardingRuleMetadataFilterGetArgs Empty = new GlobalForwardingRuleMetadataFilterGetArgs();

    /**
     * The list of label value pairs that must match labels in the
     * provided metadata based on filterMatchCriteria
     * This list must not be empty and can have at the most 64 entries.
     * Structure is documented below.
     * 
     */
    @Import(name="filterLabels", required=true)
    private Output<List<GlobalForwardingRuleMetadataFilterFilterLabelGetArgs>> filterLabels;

    /**
     * @return The list of label value pairs that must match labels in the
     * provided metadata based on filterMatchCriteria
     * This list must not be empty and can have at the most 64 entries.
     * Structure is documented below.
     * 
     */
    public Output<List<GlobalForwardingRuleMetadataFilterFilterLabelGetArgs>> filterLabels() {
        return this.filterLabels;
    }

    /**
     * Specifies how individual filterLabel matches within the list of
     * filterLabels contribute towards the overall metadataFilter match.
     * MATCH_ANY - At least one of the filterLabels must have a matching
     * label in the provided metadata.
     * MATCH_ALL - All filterLabels must have matching labels in the
     * provided metadata.
     * Possible values are `MATCH_ANY` and `MATCH_ALL`.
     * 
     */
    @Import(name="filterMatchCriteria", required=true)
    private Output<String> filterMatchCriteria;

    /**
     * @return Specifies how individual filterLabel matches within the list of
     * filterLabels contribute towards the overall metadataFilter match.
     * MATCH_ANY - At least one of the filterLabels must have a matching
     * label in the provided metadata.
     * MATCH_ALL - All filterLabels must have matching labels in the
     * provided metadata.
     * Possible values are `MATCH_ANY` and `MATCH_ALL`.
     * 
     */
    public Output<String> filterMatchCriteria() {
        return this.filterMatchCriteria;
    }

    private GlobalForwardingRuleMetadataFilterGetArgs() {}

    private GlobalForwardingRuleMetadataFilterGetArgs(GlobalForwardingRuleMetadataFilterGetArgs $) {
        this.filterLabels = $.filterLabels;
        this.filterMatchCriteria = $.filterMatchCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalForwardingRuleMetadataFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalForwardingRuleMetadataFilterGetArgs $;

        public Builder() {
            $ = new GlobalForwardingRuleMetadataFilterGetArgs();
        }

        public Builder(GlobalForwardingRuleMetadataFilterGetArgs defaults) {
            $ = new GlobalForwardingRuleMetadataFilterGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filterLabels The list of label value pairs that must match labels in the
         * provided metadata based on filterMatchCriteria
         * This list must not be empty and can have at the most 64 entries.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filterLabels(Output<List<GlobalForwardingRuleMetadataFilterFilterLabelGetArgs>> filterLabels) {
            $.filterLabels = filterLabels;
            return this;
        }

        /**
         * @param filterLabels The list of label value pairs that must match labels in the
         * provided metadata based on filterMatchCriteria
         * This list must not be empty and can have at the most 64 entries.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filterLabels(List<GlobalForwardingRuleMetadataFilterFilterLabelGetArgs> filterLabels) {
            return filterLabels(Output.of(filterLabels));
        }

        /**
         * @param filterLabels The list of label value pairs that must match labels in the
         * provided metadata based on filterMatchCriteria
         * This list must not be empty and can have at the most 64 entries.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filterLabels(GlobalForwardingRuleMetadataFilterFilterLabelGetArgs... filterLabels) {
            return filterLabels(List.of(filterLabels));
        }

        /**
         * @param filterMatchCriteria Specifies how individual filterLabel matches within the list of
         * filterLabels contribute towards the overall metadataFilter match.
         * MATCH_ANY - At least one of the filterLabels must have a matching
         * label in the provided metadata.
         * MATCH_ALL - All filterLabels must have matching labels in the
         * provided metadata.
         * Possible values are `MATCH_ANY` and `MATCH_ALL`.
         * 
         * @return builder
         * 
         */
        public Builder filterMatchCriteria(Output<String> filterMatchCriteria) {
            $.filterMatchCriteria = filterMatchCriteria;
            return this;
        }

        /**
         * @param filterMatchCriteria Specifies how individual filterLabel matches within the list of
         * filterLabels contribute towards the overall metadataFilter match.
         * MATCH_ANY - At least one of the filterLabels must have a matching
         * label in the provided metadata.
         * MATCH_ALL - All filterLabels must have matching labels in the
         * provided metadata.
         * Possible values are `MATCH_ANY` and `MATCH_ALL`.
         * 
         * @return builder
         * 
         */
        public Builder filterMatchCriteria(String filterMatchCriteria) {
            return filterMatchCriteria(Output.of(filterMatchCriteria));
        }

        public GlobalForwardingRuleMetadataFilterGetArgs build() {
            $.filterLabels = Objects.requireNonNull($.filterLabels, "expected parameter 'filterLabels' to be non-null");
            $.filterMatchCriteria = Objects.requireNonNull($.filterMatchCriteria, "expected parameter 'filterMatchCriteria' to be non-null");
            return $;
        }
    }

}
