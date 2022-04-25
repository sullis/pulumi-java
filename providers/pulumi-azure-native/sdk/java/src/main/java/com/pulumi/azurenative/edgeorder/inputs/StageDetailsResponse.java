// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Resource stage details.
 * 
 */
public final class StageDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final StageDetailsResponse Empty = new StageDetailsResponse();

    /**
     * Display name of the resource stage.
     * 
     */
    @Import(name="displayName", required=true)
    private String displayName;

    /**
     * @return Display name of the resource stage.
     * 
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Stage name
     * 
     */
    @Import(name="stageName", required=true)
    private String stageName;

    /**
     * @return Stage name
     * 
     */
    public String stageName() {
        return this.stageName;
    }

    /**
     * Stage status.
     * 
     */
    @Import(name="stageStatus", required=true)
    private String stageStatus;

    /**
     * @return Stage status.
     * 
     */
    public String stageStatus() {
        return this.stageStatus;
    }

    /**
     * Stage start time
     * 
     */
    @Import(name="startTime", required=true)
    private String startTime;

    /**
     * @return Stage start time
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    private StageDetailsResponse() {}

    private StageDetailsResponse(StageDetailsResponse $) {
        this.displayName = $.displayName;
        this.stageName = $.stageName;
        this.stageStatus = $.stageStatus;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StageDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StageDetailsResponse $;

        public Builder() {
            $ = new StageDetailsResponse();
        }

        public Builder(StageDetailsResponse defaults) {
            $ = new StageDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName Display name of the resource stage.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param stageName Stage name
         * 
         * @return builder
         * 
         */
        public Builder stageName(String stageName) {
            $.stageName = stageName;
            return this;
        }

        /**
         * @param stageStatus Stage status.
         * 
         * @return builder
         * 
         */
        public Builder stageStatus(String stageStatus) {
            $.stageStatus = stageStatus;
            return this;
        }

        /**
         * @param startTime Stage start time
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            $.startTime = startTime;
            return this;
        }

        public StageDetailsResponse build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.stageName = Objects.requireNonNull($.stageName, "expected parameter 'stageName' to be non-null");
            $.stageStatus = Objects.requireNonNull($.stageStatus, "expected parameter 'stageStatus' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}
