// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.features.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AuthorizationProfileResponse {
    /**
     * The approved time
     * 
     */
    private final String approvedTime;
    /**
     * The approver
     * 
     */
    private final String approver;
    /**
     * The requested time
     * 
     */
    private final String requestedTime;
    /**
     * The requester
     * 
     */
    private final String requester;
    /**
     * The requester object id
     * 
     */
    private final String requesterObjectId;

    @OutputCustomType.Constructor({"approvedTime","approver","requestedTime","requester","requesterObjectId"})
    private AuthorizationProfileResponse(
        String approvedTime,
        String approver,
        String requestedTime,
        String requester,
        String requesterObjectId) {
        this.approvedTime = Objects.requireNonNull(approvedTime);
        this.approver = Objects.requireNonNull(approver);
        this.requestedTime = Objects.requireNonNull(requestedTime);
        this.requester = Objects.requireNonNull(requester);
        this.requesterObjectId = Objects.requireNonNull(requesterObjectId);
    }

    /**
     * The approved time
     * 
    */
    public String getApprovedTime() {
        return this.approvedTime;
    }
    /**
     * The approver
     * 
    */
    public String getApprover() {
        return this.approver;
    }
    /**
     * The requested time
     * 
    */
    public String getRequestedTime() {
        return this.requestedTime;
    }
    /**
     * The requester
     * 
    */
    public String getRequester() {
        return this.requester;
    }
    /**
     * The requester object id
     * 
    */
    public String getRequesterObjectId() {
        return this.requesterObjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String approvedTime;
        private String approver;
        private String requestedTime;
        private String requester;
        private String requesterObjectId;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvedTime = defaults.approvedTime;
    	      this.approver = defaults.approver;
    	      this.requestedTime = defaults.requestedTime;
    	      this.requester = defaults.requester;
    	      this.requesterObjectId = defaults.requesterObjectId;
        }

        public Builder setApprovedTime(String approvedTime) {
            this.approvedTime = Objects.requireNonNull(approvedTime);
            return this;
        }

        public Builder setApprover(String approver) {
            this.approver = Objects.requireNonNull(approver);
            return this;
        }

        public Builder setRequestedTime(String requestedTime) {
            this.requestedTime = Objects.requireNonNull(requestedTime);
            return this;
        }

        public Builder setRequester(String requester) {
            this.requester = Objects.requireNonNull(requester);
            return this;
        }

        public Builder setRequesterObjectId(String requesterObjectId) {
            this.requesterObjectId = Objects.requireNonNull(requesterObjectId);
            return this;
        }
        public AuthorizationProfileResponse build() {
            return new AuthorizationProfileResponse(approvedTime, approver, requestedTime, requester, requesterObjectId);
        }
    }
}