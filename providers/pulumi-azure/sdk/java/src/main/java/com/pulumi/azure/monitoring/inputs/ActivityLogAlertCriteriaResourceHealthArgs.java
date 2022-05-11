// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActivityLogAlertCriteriaResourceHealthArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActivityLogAlertCriteriaResourceHealthArgs Empty = new ActivityLogAlertCriteriaResourceHealthArgs();

    /**
     * The current resource health statuses that will log an alert. Possible values are `Available`, `Degraded`, `Unavailable` and `Unknown`.
     * 
     */
    @Import(name="currents")
    private @Nullable Output<List<String>> currents;

    /**
     * @return The current resource health statuses that will log an alert. Possible values are `Available`, `Degraded`, `Unavailable` and `Unknown`.
     * 
     */
    public Optional<Output<List<String>>> currents() {
        return Optional.ofNullable(this.currents);
    }

    /**
     * The previous resource health statuses that will log an alert. Possible values are `Available`, `Degraded`, `Unavailable` and `Unknown`.
     * 
     */
    @Import(name="previouses")
    private @Nullable Output<List<String>> previouses;

    /**
     * @return The previous resource health statuses that will log an alert. Possible values are `Available`, `Degraded`, `Unavailable` and `Unknown`.
     * 
     */
    public Optional<Output<List<String>>> previouses() {
        return Optional.ofNullable(this.previouses);
    }

    /**
     * The reason that will log an alert. Possible values are `PlatformInitiated` (such as a problem with the resource in an affected region of an Azure incident), `UserInitiated` (such as a shutdown request of a VM) and `Unknown`.
     * 
     */
    @Import(name="reasons")
    private @Nullable Output<List<String>> reasons;

    /**
     * @return The reason that will log an alert. Possible values are `PlatformInitiated` (such as a problem with the resource in an affected region of an Azure incident), `UserInitiated` (such as a shutdown request of a VM) and `Unknown`.
     * 
     */
    public Optional<Output<List<String>>> reasons() {
        return Optional.ofNullable(this.reasons);
    }

    private ActivityLogAlertCriteriaResourceHealthArgs() {}

    private ActivityLogAlertCriteriaResourceHealthArgs(ActivityLogAlertCriteriaResourceHealthArgs $) {
        this.currents = $.currents;
        this.previouses = $.previouses;
        this.reasons = $.reasons;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActivityLogAlertCriteriaResourceHealthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActivityLogAlertCriteriaResourceHealthArgs $;

        public Builder() {
            $ = new ActivityLogAlertCriteriaResourceHealthArgs();
        }

        public Builder(ActivityLogAlertCriteriaResourceHealthArgs defaults) {
            $ = new ActivityLogAlertCriteriaResourceHealthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param currents The current resource health statuses that will log an alert. Possible values are `Available`, `Degraded`, `Unavailable` and `Unknown`.
         * 
         * @return builder
         * 
         */
        public Builder currents(@Nullable Output<List<String>> currents) {
            $.currents = currents;
            return this;
        }

        /**
         * @param currents The current resource health statuses that will log an alert. Possible values are `Available`, `Degraded`, `Unavailable` and `Unknown`.
         * 
         * @return builder
         * 
         */
        public Builder currents(List<String> currents) {
            return currents(Output.of(currents));
        }

        /**
         * @param currents The current resource health statuses that will log an alert. Possible values are `Available`, `Degraded`, `Unavailable` and `Unknown`.
         * 
         * @return builder
         * 
         */
        public Builder currents(String... currents) {
            return currents(List.of(currents));
        }

        /**
         * @param previouses The previous resource health statuses that will log an alert. Possible values are `Available`, `Degraded`, `Unavailable` and `Unknown`.
         * 
         * @return builder
         * 
         */
        public Builder previouses(@Nullable Output<List<String>> previouses) {
            $.previouses = previouses;
            return this;
        }

        /**
         * @param previouses The previous resource health statuses that will log an alert. Possible values are `Available`, `Degraded`, `Unavailable` and `Unknown`.
         * 
         * @return builder
         * 
         */
        public Builder previouses(List<String> previouses) {
            return previouses(Output.of(previouses));
        }

        /**
         * @param previouses The previous resource health statuses that will log an alert. Possible values are `Available`, `Degraded`, `Unavailable` and `Unknown`.
         * 
         * @return builder
         * 
         */
        public Builder previouses(String... previouses) {
            return previouses(List.of(previouses));
        }

        /**
         * @param reasons The reason that will log an alert. Possible values are `PlatformInitiated` (such as a problem with the resource in an affected region of an Azure incident), `UserInitiated` (such as a shutdown request of a VM) and `Unknown`.
         * 
         * @return builder
         * 
         */
        public Builder reasons(@Nullable Output<List<String>> reasons) {
            $.reasons = reasons;
            return this;
        }

        /**
         * @param reasons The reason that will log an alert. Possible values are `PlatformInitiated` (such as a problem with the resource in an affected region of an Azure incident), `UserInitiated` (such as a shutdown request of a VM) and `Unknown`.
         * 
         * @return builder
         * 
         */
        public Builder reasons(List<String> reasons) {
            return reasons(Output.of(reasons));
        }

        /**
         * @param reasons The reason that will log an alert. Possible values are `PlatformInitiated` (such as a problem with the resource in an affected region of an Azure incident), `UserInitiated` (such as a shutdown request of a VM) and `Unknown`.
         * 
         * @return builder
         * 
         */
        public Builder reasons(String... reasons) {
            return reasons(List.of(reasons));
        }

        public ActivityLogAlertCriteriaResourceHealthArgs build() {
            return $;
        }
    }

}
