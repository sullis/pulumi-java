// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.outputs;

import io.pulumi.azurenative.orbital.outputs.ResourceReferenceResponse;
import io.pulumi.azurenative.orbital.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetContactResult {
    /**
     * The reference to the contact profile resource.
     * 
     */
    private final ResourceReferenceResponse contactProfile;
    /**
     * Azimuth of the antenna at the end of the contact in decimal degrees.
     * 
     */
    private final Double endAzimuthDegrees;
    /**
     * Spacecraft elevation above the horizon at contact end.
     * 
     */
    private final Double endElevationDegrees;
    /**
     * Any error message while scheduling a contact.
     * 
     */
    private final String errorMessage;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Azure Ground Station name.
     * 
     */
    private final String groundStationName;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Maximum elevation of the antenna during the contact in decimal degrees.
     * 
     */
    private final Double maximumElevationDegrees;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Reservation end time of a contact.
     * 
     */
    private final String reservationEndTime;
    /**
     * Reservation start time of a contact.
     * 
     */
    private final String reservationStartTime;
    /**
     * Receive end time of a contact.
     * 
     */
    private final String rxEndTime;
    /**
     * Receive start time of a contact.
     * 
     */
    private final String rxStartTime;
    /**
     * Azimuth of the antenna at the start of the contact in decimal degrees.
     * 
     */
    private final Double startAzimuthDegrees;
    /**
     * Spacecraft elevation above the horizon at contact start.
     * 
     */
    private final Double startElevationDegrees;
    /**
     * Status of a contact.
     * 
     */
    private final String status;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Transmit end time of a contact.
     * 
     */
    private final String txEndTime;
    /**
     * Transmit start time of a contact.
     * 
     */
    private final String txStartTime;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"contactProfile","endAzimuthDegrees","endElevationDegrees","errorMessage","etag","groundStationName","id","maximumElevationDegrees","name","reservationEndTime","reservationStartTime","rxEndTime","rxStartTime","startAzimuthDegrees","startElevationDegrees","status","systemData","txEndTime","txStartTime","type"})
    private GetContactResult(
        ResourceReferenceResponse contactProfile,
        Double endAzimuthDegrees,
        Double endElevationDegrees,
        String errorMessage,
        String etag,
        String groundStationName,
        String id,
        Double maximumElevationDegrees,
        String name,
        String reservationEndTime,
        String reservationStartTime,
        String rxEndTime,
        String rxStartTime,
        Double startAzimuthDegrees,
        Double startElevationDegrees,
        String status,
        SystemDataResponse systemData,
        String txEndTime,
        String txStartTime,
        String type) {
        this.contactProfile = Objects.requireNonNull(contactProfile);
        this.endAzimuthDegrees = Objects.requireNonNull(endAzimuthDegrees);
        this.endElevationDegrees = Objects.requireNonNull(endElevationDegrees);
        this.errorMessage = Objects.requireNonNull(errorMessage);
        this.etag = Objects.requireNonNull(etag);
        this.groundStationName = Objects.requireNonNull(groundStationName);
        this.id = Objects.requireNonNull(id);
        this.maximumElevationDegrees = Objects.requireNonNull(maximumElevationDegrees);
        this.name = Objects.requireNonNull(name);
        this.reservationEndTime = Objects.requireNonNull(reservationEndTime);
        this.reservationStartTime = Objects.requireNonNull(reservationStartTime);
        this.rxEndTime = Objects.requireNonNull(rxEndTime);
        this.rxStartTime = Objects.requireNonNull(rxStartTime);
        this.startAzimuthDegrees = Objects.requireNonNull(startAzimuthDegrees);
        this.startElevationDegrees = Objects.requireNonNull(startElevationDegrees);
        this.status = Objects.requireNonNull(status);
        this.systemData = Objects.requireNonNull(systemData);
        this.txEndTime = Objects.requireNonNull(txEndTime);
        this.txStartTime = Objects.requireNonNull(txStartTime);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The reference to the contact profile resource.
     * 
    */
    public ResourceReferenceResponse getContactProfile() {
        return this.contactProfile;
    }
    /**
     * Azimuth of the antenna at the end of the contact in decimal degrees.
     * 
    */
    public Double getEndAzimuthDegrees() {
        return this.endAzimuthDegrees;
    }
    /**
     * Spacecraft elevation above the horizon at contact end.
     * 
    */
    public Double getEndElevationDegrees() {
        return this.endElevationDegrees;
    }
    /**
     * Any error message while scheduling a contact.
     * 
    */
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Azure Ground Station name.
     * 
    */
    public String getGroundStationName() {
        return this.groundStationName;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Maximum elevation of the antenna during the contact in decimal degrees.
     * 
    */
    public Double getMaximumElevationDegrees() {
        return this.maximumElevationDegrees;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Reservation end time of a contact.
     * 
    */
    public String getReservationEndTime() {
        return this.reservationEndTime;
    }
    /**
     * Reservation start time of a contact.
     * 
    */
    public String getReservationStartTime() {
        return this.reservationStartTime;
    }
    /**
     * Receive end time of a contact.
     * 
    */
    public String getRxEndTime() {
        return this.rxEndTime;
    }
    /**
     * Receive start time of a contact.
     * 
    */
    public String getRxStartTime() {
        return this.rxStartTime;
    }
    /**
     * Azimuth of the antenna at the start of the contact in decimal degrees.
     * 
    */
    public Double getStartAzimuthDegrees() {
        return this.startAzimuthDegrees;
    }
    /**
     * Spacecraft elevation above the horizon at contact start.
     * 
    */
    public Double getStartElevationDegrees() {
        return this.startElevationDegrees;
    }
    /**
     * Status of a contact.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Transmit end time of a contact.
     * 
    */
    public String getTxEndTime() {
        return this.txEndTime;
    }
    /**
     * Transmit start time of a contact.
     * 
    */
    public String getTxStartTime() {
        return this.txStartTime;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContactResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceReferenceResponse contactProfile;
        private Double endAzimuthDegrees;
        private Double endElevationDegrees;
        private String errorMessage;
        private String etag;
        private String groundStationName;
        private String id;
        private Double maximumElevationDegrees;
        private String name;
        private String reservationEndTime;
        private String reservationStartTime;
        private String rxEndTime;
        private String rxStartTime;
        private Double startAzimuthDegrees;
        private Double startElevationDegrees;
        private String status;
        private SystemDataResponse systemData;
        private String txEndTime;
        private String txStartTime;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContactResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactProfile = defaults.contactProfile;
    	      this.endAzimuthDegrees = defaults.endAzimuthDegrees;
    	      this.endElevationDegrees = defaults.endElevationDegrees;
    	      this.errorMessage = defaults.errorMessage;
    	      this.etag = defaults.etag;
    	      this.groundStationName = defaults.groundStationName;
    	      this.id = defaults.id;
    	      this.maximumElevationDegrees = defaults.maximumElevationDegrees;
    	      this.name = defaults.name;
    	      this.reservationEndTime = defaults.reservationEndTime;
    	      this.reservationStartTime = defaults.reservationStartTime;
    	      this.rxEndTime = defaults.rxEndTime;
    	      this.rxStartTime = defaults.rxStartTime;
    	      this.startAzimuthDegrees = defaults.startAzimuthDegrees;
    	      this.startElevationDegrees = defaults.startElevationDegrees;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.txEndTime = defaults.txEndTime;
    	      this.txStartTime = defaults.txStartTime;
    	      this.type = defaults.type;
        }

        public Builder setContactProfile(ResourceReferenceResponse contactProfile) {
            this.contactProfile = Objects.requireNonNull(contactProfile);
            return this;
        }

        public Builder setEndAzimuthDegrees(Double endAzimuthDegrees) {
            this.endAzimuthDegrees = Objects.requireNonNull(endAzimuthDegrees);
            return this;
        }

        public Builder setEndElevationDegrees(Double endElevationDegrees) {
            this.endElevationDegrees = Objects.requireNonNull(endElevationDegrees);
            return this;
        }

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setGroundStationName(String groundStationName) {
            this.groundStationName = Objects.requireNonNull(groundStationName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMaximumElevationDegrees(Double maximumElevationDegrees) {
            this.maximumElevationDegrees = Objects.requireNonNull(maximumElevationDegrees);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReservationEndTime(String reservationEndTime) {
            this.reservationEndTime = Objects.requireNonNull(reservationEndTime);
            return this;
        }

        public Builder setReservationStartTime(String reservationStartTime) {
            this.reservationStartTime = Objects.requireNonNull(reservationStartTime);
            return this;
        }

        public Builder setRxEndTime(String rxEndTime) {
            this.rxEndTime = Objects.requireNonNull(rxEndTime);
            return this;
        }

        public Builder setRxStartTime(String rxStartTime) {
            this.rxStartTime = Objects.requireNonNull(rxStartTime);
            return this;
        }

        public Builder setStartAzimuthDegrees(Double startAzimuthDegrees) {
            this.startAzimuthDegrees = Objects.requireNonNull(startAzimuthDegrees);
            return this;
        }

        public Builder setStartElevationDegrees(Double startElevationDegrees) {
            this.startElevationDegrees = Objects.requireNonNull(startElevationDegrees);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTxEndTime(String txEndTime) {
            this.txEndTime = Objects.requireNonNull(txEndTime);
            return this;
        }

        public Builder setTxStartTime(String txStartTime) {
            this.txStartTime = Objects.requireNonNull(txStartTime);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetContactResult build() {
            return new GetContactResult(contactProfile, endAzimuthDegrees, endElevationDegrees, errorMessage, etag, groundStationName, id, maximumElevationDegrees, name, reservationEndTime, reservationStartTime, rxEndTime, rxStartTime, startAzimuthDegrees, startElevationDegrees, status, systemData, txEndTime, txStartTime, type);
        }
    }
}