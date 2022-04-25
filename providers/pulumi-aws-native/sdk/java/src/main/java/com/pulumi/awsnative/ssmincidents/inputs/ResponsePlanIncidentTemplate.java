// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmincidents.inputs;

import com.pulumi.awsnative.ssmincidents.inputs.ResponsePlanNotificationTargetItem;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The incident template configuration.
 * 
 */
public final class ResponsePlanIncidentTemplate extends com.pulumi.resources.InvokeArgs {

    public static final ResponsePlanIncidentTemplate Empty = new ResponsePlanIncidentTemplate();

    /**
     * The deduplication string.
     * 
     */
    @Import(name="dedupeString")
    private @Nullable String dedupeString;

    /**
     * @return The deduplication string.
     * 
     */
    public Optional<String> dedupeString() {
        return Optional.ofNullable(this.dedupeString);
    }

    /**
     * The impact value.
     * 
     */
    @Import(name="impact", required=true)
    private Integer impact;

    /**
     * @return The impact value.
     * 
     */
    public Integer impact() {
        return this.impact;
    }

    /**
     * The list of notification targets.
     * 
     */
    @Import(name="notificationTargets")
    private @Nullable List<ResponsePlanNotificationTargetItem> notificationTargets;

    /**
     * @return The list of notification targets.
     * 
     */
    public Optional<List<ResponsePlanNotificationTargetItem>> notificationTargets() {
        return Optional.ofNullable(this.notificationTargets);
    }

    /**
     * The summary string.
     * 
     */
    @Import(name="summary")
    private @Nullable String summary;

    /**
     * @return The summary string.
     * 
     */
    public Optional<String> summary() {
        return Optional.ofNullable(this.summary);
    }

    /**
     * The title string.
     * 
     */
    @Import(name="title", required=true)
    private String title;

    /**
     * @return The title string.
     * 
     */
    public String title() {
        return this.title;
    }

    private ResponsePlanIncidentTemplate() {}

    private ResponsePlanIncidentTemplate(ResponsePlanIncidentTemplate $) {
        this.dedupeString = $.dedupeString;
        this.impact = $.impact;
        this.notificationTargets = $.notificationTargets;
        this.summary = $.summary;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponsePlanIncidentTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponsePlanIncidentTemplate $;

        public Builder() {
            $ = new ResponsePlanIncidentTemplate();
        }

        public Builder(ResponsePlanIncidentTemplate defaults) {
            $ = new ResponsePlanIncidentTemplate(Objects.requireNonNull(defaults));
        }

        /**
         * @param dedupeString The deduplication string.
         * 
         * @return builder
         * 
         */
        public Builder dedupeString(@Nullable String dedupeString) {
            $.dedupeString = dedupeString;
            return this;
        }

        /**
         * @param impact The impact value.
         * 
         * @return builder
         * 
         */
        public Builder impact(Integer impact) {
            $.impact = impact;
            return this;
        }

        /**
         * @param notificationTargets The list of notification targets.
         * 
         * @return builder
         * 
         */
        public Builder notificationTargets(@Nullable List<ResponsePlanNotificationTargetItem> notificationTargets) {
            $.notificationTargets = notificationTargets;
            return this;
        }

        /**
         * @param notificationTargets The list of notification targets.
         * 
         * @return builder
         * 
         */
        public Builder notificationTargets(ResponsePlanNotificationTargetItem... notificationTargets) {
            return notificationTargets(List.of(notificationTargets));
        }

        /**
         * @param summary The summary string.
         * 
         * @return builder
         * 
         */
        public Builder summary(@Nullable String summary) {
            $.summary = summary;
            return this;
        }

        /**
         * @param title The title string.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            $.title = title;
            return this;
        }

        public ResponsePlanIncidentTemplate build() {
            $.impact = Objects.requireNonNull($.impact, "expected parameter 'impact' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}
