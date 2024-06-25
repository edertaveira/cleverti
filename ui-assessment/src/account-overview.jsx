import React from "react";
import { FaUpload } from "react-icons/fa";
import { FaCircleInfo } from "react-icons/fa6";
import { GrMail } from "react-icons/gr";

import "./account-overview.css";

const AccountOverview = ({ data }) => {
  const { supportContact, salesOverview } = data;
  const uploadSuccessRate =
    salesOverview.uploads > 0
      ? (salesOverview.successfulUploads / salesOverview.uploads) * 100
      : 0;
  const linesSavedRate =
    salesOverview.linesAttempted > 0
      ? (salesOverview.linesSaved / salesOverview.linesAttempted) * 100
      : 0;

  return (
    <div className="account-overview">
      <div className="support-container">
        <h1 className="overview-title">Account Overview</h1>
        <div className="support-contact">
          <h2>Your Feefo Support Contact</h2>
          <div className="support-info">
            <div className="support-icon">S</div>
            <div className="support-details">
              <p className="support-name">{supportContact.name}</p>

              <div className="support-name-email">
                <a
                  href={`mailto:${supportContact.email}`}
                  className="support-email"
                >
                  <GrMail />
                  {supportContact.email}
                </a>
                <p className="support-phone">020 3362 4208</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div className="sales-overview">
        <FaCircleInfo className="sales-info-icon" color="#BFBCBC" />
        <div className="sales-container">
          <h2>
            <FaUpload color="#48B7EC" />
            Sales
          </h2>
          <p>
            You had <b>{salesOverview.uploads} uploads</b> and{" "}
            <b>{salesOverview.linesSaved}</b> lines added.
          </p>
        </div>
        <div className="sales-stats">
          <div className="stat">
            <p className="stat-value">{uploadSuccessRate.toFixed(0)}%</p>
            <p className="stat-label">UPLOAD SUCCESS</p>
          </div>
          <div className="stat">
            <p className="stat-value">{linesSavedRate.toFixed(0)}%</p>
            <p className="stat-label">LINES SAVED</p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default AccountOverview;
