// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * TrafficTarget holds a single entry of the routing table for a Route.
 * 
 */
public final class TrafficTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrafficTargetArgs Empty = new TrafficTargetArgs();

    /**
     * ConfigurationName of a configuration to whose latest revision we will send this portion of traffic. When the &#34;status.latestReadyRevisionName&#34; of the referenced configuration changes, we will automatically migrate traffic from the prior &#34;latest ready&#34; revision to the new one. This field is never set in Route&#39;s status, only its spec. This is mutually exclusive with RevisionName. Cloud Run currently supports a single ConfigurationName.
     * 
     */
    @Import(name="configurationName")
    private @Nullable Output<String> configurationName;

    /**
     * @return ConfigurationName of a configuration to whose latest revision we will send this portion of traffic. When the &#34;status.latestReadyRevisionName&#34; of the referenced configuration changes, we will automatically migrate traffic from the prior &#34;latest ready&#34; revision to the new one. This field is never set in Route&#39;s status, only its spec. This is mutually exclusive with RevisionName. Cloud Run currently supports a single ConfigurationName.
     * 
     */
    public Optional<Output<String>> configurationName() {
        return Optional.ofNullable(this.configurationName);
    }

    /**
     * Optional. LatestRevision may be provided to indicate that the latest ready Revision of the Configuration should be used for this traffic target. When provided LatestRevision must be true if RevisionName is empty; it must be false when RevisionName is non-empty.
     * 
     */
    @Import(name="latestRevision")
    private @Nullable Output<Boolean> latestRevision;

    /**
     * @return Optional. LatestRevision may be provided to indicate that the latest ready Revision of the Configuration should be used for this traffic target. When provided LatestRevision must be true if RevisionName is empty; it must be false when RevisionName is non-empty.
     * 
     */
    public Optional<Output<Boolean>> latestRevision() {
        return Optional.ofNullable(this.latestRevision);
    }

    /**
     * Percent specifies percent of the traffic to this Revision or Configuration. This defaults to zero if unspecified.
     * 
     */
    @Import(name="percent")
    private @Nullable Output<Integer> percent;

    /**
     * @return Percent specifies percent of the traffic to this Revision or Configuration. This defaults to zero if unspecified.
     * 
     */
    public Optional<Output<Integer>> percent() {
        return Optional.ofNullable(this.percent);
    }

    /**
     * RevisionName of a specific revision to which to send this portion of traffic. This is mutually exclusive with ConfigurationName.
     * 
     */
    @Import(name="revisionName")
    private @Nullable Output<String> revisionName;

    /**
     * @return RevisionName of a specific revision to which to send this portion of traffic. This is mutually exclusive with ConfigurationName.
     * 
     */
    public Optional<Output<String>> revisionName() {
        return Optional.ofNullable(this.revisionName);
    }

    /**
     * Optional. Tag is used to expose a dedicated url for referencing this target exclusively.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return Optional. Tag is used to expose a dedicated url for referencing this target exclusively.
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    private TrafficTargetArgs() {}

    private TrafficTargetArgs(TrafficTargetArgs $) {
        this.configurationName = $.configurationName;
        this.latestRevision = $.latestRevision;
        this.percent = $.percent;
        this.revisionName = $.revisionName;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficTargetArgs $;

        public Builder() {
            $ = new TrafficTargetArgs();
        }

        public Builder(TrafficTargetArgs defaults) {
            $ = new TrafficTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationName ConfigurationName of a configuration to whose latest revision we will send this portion of traffic. When the &#34;status.latestReadyRevisionName&#34; of the referenced configuration changes, we will automatically migrate traffic from the prior &#34;latest ready&#34; revision to the new one. This field is never set in Route&#39;s status, only its spec. This is mutually exclusive with RevisionName. Cloud Run currently supports a single ConfigurationName.
         * 
         * @return builder
         * 
         */
        public Builder configurationName(@Nullable Output<String> configurationName) {
            $.configurationName = configurationName;
            return this;
        }

        /**
         * @param configurationName ConfigurationName of a configuration to whose latest revision we will send this portion of traffic. When the &#34;status.latestReadyRevisionName&#34; of the referenced configuration changes, we will automatically migrate traffic from the prior &#34;latest ready&#34; revision to the new one. This field is never set in Route&#39;s status, only its spec. This is mutually exclusive with RevisionName. Cloud Run currently supports a single ConfigurationName.
         * 
         * @return builder
         * 
         */
        public Builder configurationName(String configurationName) {
            return configurationName(Output.of(configurationName));
        }

        /**
         * @param latestRevision Optional. LatestRevision may be provided to indicate that the latest ready Revision of the Configuration should be used for this traffic target. When provided LatestRevision must be true if RevisionName is empty; it must be false when RevisionName is non-empty.
         * 
         * @return builder
         * 
         */
        public Builder latestRevision(@Nullable Output<Boolean> latestRevision) {
            $.latestRevision = latestRevision;
            return this;
        }

        /**
         * @param latestRevision Optional. LatestRevision may be provided to indicate that the latest ready Revision of the Configuration should be used for this traffic target. When provided LatestRevision must be true if RevisionName is empty; it must be false when RevisionName is non-empty.
         * 
         * @return builder
         * 
         */
        public Builder latestRevision(Boolean latestRevision) {
            return latestRevision(Output.of(latestRevision));
        }

        /**
         * @param percent Percent specifies percent of the traffic to this Revision or Configuration. This defaults to zero if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder percent(@Nullable Output<Integer> percent) {
            $.percent = percent;
            return this;
        }

        /**
         * @param percent Percent specifies percent of the traffic to this Revision or Configuration. This defaults to zero if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder percent(Integer percent) {
            return percent(Output.of(percent));
        }

        /**
         * @param revisionName RevisionName of a specific revision to which to send this portion of traffic. This is mutually exclusive with ConfigurationName.
         * 
         * @return builder
         * 
         */
        public Builder revisionName(@Nullable Output<String> revisionName) {
            $.revisionName = revisionName;
            return this;
        }

        /**
         * @param revisionName RevisionName of a specific revision to which to send this portion of traffic. This is mutually exclusive with ConfigurationName.
         * 
         * @return builder
         * 
         */
        public Builder revisionName(String revisionName) {
            return revisionName(Output.of(revisionName));
        }

        /**
         * @param tag Optional. Tag is used to expose a dedicated url for referencing this target exclusively.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag Optional. Tag is used to expose a dedicated url for referencing this target exclusively.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        public TrafficTargetArgs build() {
            return $;
        }
    }

}
