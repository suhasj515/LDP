import React, { useEffect, useState } from "react";
import { buyCake } from "/home/suhasj/LDP/React/reacr-jsript/src/components/poc/Redux Actions/CakeActions.js";
import { connect } from "react-redux";
import { nextPage } from "/home/suhasj/LDP/React/reacr-jsript/src/components/poc/Redux Actions/NextPage.js";
import { prevPage } from "/home/suhasj/LDP/React/reacr-jsript/src/components/poc/Redux Actions/PrevPage.js";
import { makeStyles } from "@mui/styles";
import { Link } from "@mui/material";
import ArrowForwardIosIcon from "@mui/icons-material/ArrowForwardIos";
import ArrowBackIosIcon from "@mui/icons-material/ArrowBackIos";
import HomeIcon from "@mui/icons-material/Home";

const BookPages = (props) => {
  const [viewNext, setViewNext] = useState(false);
  const [viewPrev, setViewPrev] = useState(false);

  const bookDetails = [
    [
      {
        Title: "What’s in it for me? A holistic approach to business. ",
        discription: [
          "How likely is it that my start-up idea will succeed? What can I do to make my business more profitable? How will changes in my department affect the rest of the company?",
          "These are just some of the questions that entrepreneurs, managers, and department heads ask themselves every day. The answers to these questions tend to be highly specific to individual companies. What works in one context doesn’t necessarily work in another. ",
        ],
      },
      {
        Title:
          "Businesses are like human bodies – they thrive when you treat them holistically. ",
        discription: [
          "If you’re open-minded and pay attention to what’s happening around you, you can discover important truths in the most unlikely situations. Take it from the author. One of the most impactful lessons about business he’s had in his life came from something deeply personal: his chronic knee pain.  ",
          "He visited specialist after specialist, but none of them seem",
          "Six months after this surgery, he decided to try a different approach. He talked to physiotherapists and osteopaths and spent hours on foam rollers, but that didn’t help either. Then, just as he was about to call it quits and resign himself to a life of chronic pain, he met a sports rehabilitation expert called Nicole Parsons. ",
        ],
      },
      {
        Title: "Thrive when you treat them holistically. ",
        discription: [
          "Picture yourself on a boat in the middle of the open ocean. The sun is shining, the sky a brilliant blue. The sea is calm. And then, out of nowhere, a hundred-foot wave appears on the horizon.",
          "Yes, you heard right: A hundred-foot wave. And no, this isn’t a scene from The Perfect Storm. While rogue waves may seem like a sensational Hollywood invention, they’re actually a frighteningly real feature of the deep sea. In the North Sea alone, rogue waves are estimated to occur every ten hours, wreaking havoc on unsuspecting sailors and leaving serious wreckage in their wake. When you see a rogue wave in person, one thing is clear: there’s going to be a tremendous impact.",
          "But this scenario doesn’t only occur in sailing; rogue waves also happen in business. Over the course of history, unexpected events have caused the demise of countless companies across industries and around the world.",
        ],
      },
    ],
    [
      {
        Title:
          "Rogue waves can sink any business that fails to build resilience.",
        discription: [
          "Picture yourself on a boat in the middle of the open ocean. The sun is shining, the sky a brilliant blue. The sea is calm. And then, out of nowhere, a hundred-foot wave appears on the horizon.",
          "Yes, you heard right: A hundred-foot wave. And no, this isn’t a scene from The Perfect Storm. While rogue waves may seem like a sensational Hollywood invention, they’re actually a frighteningly real feature of the deep sea. In the North Sea alone, rogue waves are estimated to occur every ten hours, wreaking havoc on unsuspecting sailors and leaving serious wreckage in their wake. When you see a rogue wave in person, one thing is clear: there’s going to be a tremendous impact.",
          "But this scenario doesn’t only occur in sailing; rogue waves also happen in business. Over the course of history, unexpected events have caused the demise of countless companies across industries and around the world.",
        ],
      },
      {
        Title: "Businesses that do their research see rogue waves coming.",
        discription: [
          "You may be wondering: Is it even possible to prepare for something as unpredictable as a rogue wave? ",
          "Fortunately, the answer is yes. It turns out those hundred-foot swells that take sailors by surprise don’t come out of nowhere. Scientifically speaking, rogue waves are actually formed by the collision of smaller waves. In other words, they aren’t random at all. ",
          "Just like the rogue waves that plague sailors, those that wreak havoc in the business world are caused by a series of compounding social, economic, and technological undercurrents. For experts who study ocean behavior, rogue waves are increasingly forecastable – and with practice, business leaders can predict them too. ",
        ],
      },
    ],
  ];

  useEffect(() => {
    if (props.page - 1 === 0) {
      setViewPrev(true);
    } else {
      setViewPrev(false);
    }

    if (props.page === bookDetails[props.bookId].length) {
      setViewNext(true);
    } else {
      setViewNext(false);
    }
  }, [props.page]);

  const styles = makeStyles({
    GridMargins: {
      marginRight: "460px",
      marginLeft: "460px",
    },
    Headers: {
      lineHeight: 1.25,
      margin: "0 0 1em",
      fontSize: "3rem",
      color: "#03314b",
      marginBottom: 20,
      paddingBottom: "20px",
      borderBottom: "0.6px solid black",
    },
    Description: {
      fontSize: "1.428rem",
      lineHeight: "1.467em",
      fontFamily: '"ff-tisa-web-pro", Georgia, Times New Roman, Times, serif',
      color: "inherit",
      fontWeight: 0,
      borderBottom: "0.6px solid black",
    },

    PageBar: {
      display: "flex",
      position: "static",
      alignItems: "normal",
      justifyContent: "space-between",
    },
  });

  const classes = styles();

  return (
    <>
      <Link href="/" data-testid="bookpage">
        <HomeIcon
          fontSize="large"
          style={{ position: "absolute", marginTop: "100px" }}
        />
      </Link>
      <div className={classes.GridMargins}>
        <article>
          <h1>Page no {props.page} </h1>
          <h1 className={classes.Headers}>
            {" "}
            {bookDetails[props.bookId][props.page - 1].Title}
          </h1>{" "}
          <br />
          <p className={classes.Description}>
            {bookDetails[props.bookId][props.page - 1].discription.map((e) => (
              <p>{e}</p>
            ))}
          </p>
        </article>
        <div className={classes.PageBar}>
          <Link
            href="#"
            underline="hover"
            hidden={viewPrev}
            onClick={props.prevPage}
          >
            <ArrowBackIosIcon style={{ fontSize: "medium" }} />
            Previous blink
          </Link>
          {props.page}/{bookDetails[props.bookId].length}
          <Link
            href="#"
            underline="hover"
            hidden={viewNext}
            onClick={props.nextPage}
          >
            Next blink <ArrowForwardIosIcon style={{ fontSize: "medium" }} />
          </Link>
        </div>
      </div>
    </>
  );
};

const mapStateToProps = (state) => {
  return {
    noOfCakes: state.noOfCakes,
    page: state.page,
  };
};

const mapDispatchToProps = (dispatch) => {
  return {
    buyCake: () => dispatch(buyCake()),
    nextPage: () => dispatch(nextPage()),
    prevPage: () => dispatch(prevPage()),
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(BookPages);
