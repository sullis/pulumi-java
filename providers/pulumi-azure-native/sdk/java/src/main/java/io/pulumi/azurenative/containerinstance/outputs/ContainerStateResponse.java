// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContainerStateResponse {
    /**
     * The human-readable status of the container instance state.
     * 
     */
    private final String detailStatus;
    /**
     * The container instance exit codes correspond to those from the `docker run` command.
     * 
     */
    private final Integer exitCode;
    /**
     * The date-time when the container instance state finished.
     * 
     */
    private final String finishTime;
    /**
     * The date-time when the container instance state started.
     * 
     */
    private final String startTime;
    /**
     * The state of the container instance.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"detailStatus","exitCode","finishTime","startTime","state"})
    private ContainerStateResponse(
        String detailStatus,
        Integer exitCode,
        String finishTime,
        String startTime,
        String state) {
        this.detailStatus = Objects.requireNonNull(detailStatus);
        this.exitCode = Objects.requireNonNull(exitCode);
        this.finishTime = Objects.requireNonNull(finishTime);
        this.startTime = Objects.requireNonNull(startTime);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * The human-readable status of the container instance state.
     * 
    */
    public String getDetailStatus() {
        return this.detailStatus;
    }
    /**
     * The container instance exit codes correspond to those from the `docker run` command.
     * 
    */
    public Integer getExitCode() {
        return this.exitCode;
    }
    /**
     * The date-time when the container instance state finished.
     * 
    */
    public String getFinishTime() {
        return this.finishTime;
    }
    /**
     * The date-time when the container instance state started.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The state of the container instance.
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String detailStatus;
        private Integer exitCode;
        private String finishTime;
        private String startTime;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detailStatus = defaults.detailStatus;
    	      this.exitCode = defaults.exitCode;
    	      this.finishTime = defaults.finishTime;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder setDetailStatus(String detailStatus) {
            this.detailStatus = Objects.requireNonNull(detailStatus);
            return this;
        }

        public Builder setExitCode(Integer exitCode) {
            this.exitCode = Objects.requireNonNull(exitCode);
            return this;
        }

        public Builder setFinishTime(String finishTime) {
            this.finishTime = Objects.requireNonNull(finishTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public ContainerStateResponse build() {
            return new ContainerStateResponse(detailStatus, exitCode, finishTime, startTime, state);
        }
    }
}